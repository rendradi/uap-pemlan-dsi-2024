import java.util.Scanner;

public class AksiUser extends Aksi {
    @Override
    public void tampilanAksi() {
        System.out.println("Aksi User:");
        System.out.println("1. Pesan Film");
        System.out.println("2. Lihat Saldo");
        System.out.println("3. Lihat List Film");
        System.out.println("4. Lihat Pesanan");
        System.out.println("5. Logout");
        System.out.println("6. Tutup Aplikasi");
    }

    @Override
    public void keluar() {
        Akun.logout();
        System.out.println("Anda telah logout.");
    }

    @Override
    public void tutupAplikasi() {
        System.out.println("Aplikasi ditutup.");
        System.exit(0);
    }

    @Override
    public void lihatListFilm() {
        if (Film.getFilms().isEmpty()) {
            System.out.println("||" + "=".repeat(40) + "||");
            System.out.println("||" + " ".repeat(6) + "Tidak ada film yang tersedia" + " ".repeat(6) + "||");
            System.out.println("||" + "=".repeat(40) + "||");
            return;
        }
        System.out.println("||" + "=".repeat(40) + "||");
        System.out.println("||" + " ".repeat(7) + "Daftar Film yang Tersedia" + " ".repeat(8) + "||");
        System.out.println("||" + "=".repeat(40) + "||");
        for (Film film : Film.getFilms().values()) {
            System.out.printf("%s - Deskripsi: %s - Harga: %.2f - Stok: %d%n",
                    film.getName(), film.getDescription(), film.getPrice(), film.getStock());
        }
    }


    public void lihatSaldo() {
        User currentUser = Akun.getCurrentUser();
        System.out.println("Saldo Anda: " + currentUser.getSaldo());
    }


    public void pesanFilm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Film yang ingin dipesan: ");
        String namaFilm = scanner.nextLine();
        Film film = Film.getFilms().get(namaFilm);

        if (film == null) {
            System.out.println("Film yang dicari tidak ditemukan.");
            return;
        }

        System.out.print("Jumlah tiket yang ingin dipesan: ");
        int jumlah = scanner.nextInt();

        if (film.getStock() < jumlah) {
            System.out.println("Stok tiket tidak mencukupi.");
            return;
        }

        double hargaSatuan = film.getPrice();
        double totalHarga = hargaSatuan * jumlah;
        User currentUser = Akun.getCurrentUser();

        if (currentUser.getSaldo() < totalHarga) {
            System.out.printf("Saldo tidak mencukupi, saldo yang dimiliki %.2f.%n", currentUser.getSaldo());
            return;
        }

        currentUser.setSaldo(currentUser.getSaldo() - totalHarga);
        film.setStock(film.getStock() - jumlah);
        currentUser.addPesanan(film, jumlah);

        System.out.printf("Harga satuan tiket %.2f%n", hargaSatuan);
        System.out.printf("Total harga %.2f%n", totalHarga);
        System.out.println("Tiket berhasil dipesan.");
    }

    public void lihatPesanan() {
        User currentUser = Akun.getCurrentUser();
        if (currentUser.getPesanan().isEmpty()) {
            System.out.println("Kamu belum pernah melakukan pemesanan.");
            return;
        }

        System.out.println("Daftar Pesanan Anda:");
        for (Pesanan pesanan : currentUser.getPesanan().values()) {
            Film film = pesanan.getFilm();
            int jumlah = pesanan.getKuantitas();
            double totalHarga = film.getPrice() * jumlah;
            System.out.printf("Film: %s - Jumlah: %d - Total Harga: %.2f%n", film.getName(), jumlah, totalHarga);
        }
    }


}
