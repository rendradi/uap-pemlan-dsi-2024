import java.util.Scanner;

public class AksiAdmin extends Aksi {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void tampilanAksi() {
        System.out.println("Aksi Admin:");
        System.out.println("1. Tambah Film");
        System.out.println("2. Lihat List Film");
        System.out.println("3. Logout");
        System.out.println("4. Tutup Aplikasi");
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
            System.out.println("Nama: " + film.getName());
            System.out.println("Deskripsi: " + film.getDescription());
            System.out.println("Harga: " + film.getPrice());
            System.out.println("Stok: " + film.getStock());
            System.out.println();
        }
    }

    public void tambahFilm() {
        System.out.print("Nama Film: ");
        String nama = scanner.nextLine();
        if (Film.getFilms().containsKey(nama)) {
            System.out.printf("Film %s sudah ada.%n", nama);
            return;
        }
        System.out.print("Deskripsi Film: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Harga Tiket: ");
        double harga = scanner.nextDouble();
        System.out.print("Stok Tiket: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        Film.addFilm(nama, deskripsi, harga, stok);
        System.out.printf("Film %s berhasil ditambahkan.%n", nama);
    }
}
