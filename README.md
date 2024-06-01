# Studi Kasus: Aplikasi Pemesanan Tiket Bioskop

## Deskripsi

Anda diminta untuk membuat sebuah aplikasi pemesanan tiket film berbasis terminal. Aplikasi ini memiliki dua peran
utama: user dan admin. Berikut adalah rincian fitur yang harus ada dalam aplikasi:

## Fitur untuk User:

### 1. Login:

#### User dapat login ke dalam sistem menggunakan username dan password.

#### Ketentuan:

- Jika login berhasil, tampilkan pesan sambutan dengan nama user.
- Jika login gagal, tampilkan pesan kesalahan.

### Expected Output:

```text
Silakan login >_<
Username: user
Password: 123
Selamat datang user
```

```text
Silakan login >_<
Username: user
Password: 123456789
Username atau password salah. Silakan coba lagi.
```

### 2. Lihat Saldo:

#### User dapat melihat saldo yang tersedia di akunnya.

#### Ketentuan:

- Tampilkan saldo yang sesuai dari user tersebut.

#### Expected Output:

```text
Saldo anda: 90000
```

### 3. Lihat Daftar Film:

#### User dapat melihat daftar film yang tersedia beserta deskripsinya.

#### Ketentuan:

- Tampilkan daftar film beserta deskripsi, harga, dan stok yang tersedia.

#### Expected Output:

```text
Film A - Deskripsi A - Harga: 50000 - Stok: 10
Film B - Deskripsi B - Harga: 60000 - Stok: 5
```

### 4. Pesan Film:

#### User dapat memesan tiket untuk film yang tersedia. User harus memasukkan jumlah tiket yang ingin dipesan. Harga pesanan harus cukup dengan saldo yang dimiliki.

#### Ketentuan:

- User memasukan input nama film yang ingin dipesan lalu input total tiketnya.
- Jika film yang diinput kan tidak ada, maka tampilkan jika film tidak ditemukan
- Jika pemesanan berhasil, tampilkan pesan konfirmasi pemesanan.
- Jika stok tidak mencukupi tampilkan pesan kesalahan.
- Jika saldo tidak mencukupi tampilkan pesan kesalahan beserta saldo yang dimiliki.
- Saldo tidak boleh sampai negatif.

#### Expected Output:

```text
Nama Film yang ingin dipesan: Film A
Jumlah tiket yang ingin dipesan: 2
Harga satuan tiket 50000
Total harga 100000
Tiket berhasil dipesan.
```

```text
Nama Film yang ingin dipesan: Film C
Film yang dicari tidak ditemukan.
```

```text
Nama Film yang ingin dipesan: Film A
Jumlah tiket yang ingin dipesan: 20
Stok tiket tidak mencukupi.
```

```text
Nama Film yang ingin dipesan: Film A
Jumlah tiket yang ingin dipesan: 5
Harga satuan tiket 50000
Total harga 250000
Saldo tidak mencukupi, saldo yang dimiliki 100000.
```

### 5. Lihat pesanan:

#### User dapat melihat daftar film yang sudah dipesan sebelumnya.

#### Ketentuan:

- Tampilkan daftar pesanan user beserta jumlah tiket yang dipesan.
- Tampilkan pesan jika user belum melakukan pemesanan sama sekali.

### Expected Output:

```text
Film: Film A - Jumlah: 2 - Total Harga: 100000
```

```text
Kamu belum pernah melakukan pemesanan.
```

### 6. Logout:

#### User dapat logout dari sistem.

#### Ketentuan:

- Tampilkan pesan logout.
- Setelah logout tampilkan menu awal.

#### Expected Output:

```text
Anda telah logout.
```

### 7. Tutup Aplikasi:

#### User dapat menutup aplikasi.

#### Ketentuan:

- Tampilkan pesan penutupan aplikasi.

#### Expected Output:

```text
Aplikasi ditutup.
```

## Fitur untuk Admin:

### 1. Login:

#### User dapat login ke dalam sistem menggunakan username dan password.

#### Ketentuan:

- Jika login berhasil, tampilkan pesan sambutan dengan nama user.
- Jika login gagal, tampilkan pesan kesalahan.

### Expected Output:

```text
Silakan login >_<
Username: user
Password: 123
Selamat datang user
```

```text
Silakan login >_<
Username: user
Password: 123456789
Username atau password salah. Silakan coba lagi.
```

### 2. Lihat Daftar Film:

#### User dapat melihat daftar film yang tersedia beserta deskripsinya.

#### Ketentuan:

- Tampilkan daftar film beserta deskripsi, harga, dan stok yang tersedia.

#### Expected Output:

```text
Film A - Deskripsi A - Harga: 50000 - Stok: 10
Film B - Deskripsi B - Harga: 60000 - Stok: 5
```

### 3. Tambah Film:

#### Admin dapat menambahkan film baru ke dalam sistem dengan memasukkan nama film, deskripsi singkat, harga tiket, dan stok tiket.

#### Ketentuan:

- Tampilkan pesan konfirmasi bahwa film berhasil ditambahkan.
- Tampilkan pesan kesalahan jika nama film sudah ada.

#### Expected Output:

```text
Nama Film: Doraemon
Deskripsi Film: Deskripsi C
Harga Tiket: 70000
Stok Tiket: 15
Film Doraemon berhasil ditambahkan.
```

```text
Nama Film: Doraemon
Deskripsi Film: Deskripsi C
Harga Tiket: 70000
Stok Tiket: 15
Film Doraemon sudah ada.
```

### 4. Logout:

#### User dapat logout dari sistem.

#### Ketentuan:

- Tampilkan pesan logout.
- Setelah logout tampilkan menu awal.

#### Expected Output:

```text
Anda telah logout.
```

### 5. Tutup Aplikasi:

#### User dapat menutup aplikasi.

#### Ketentuan:

- Tampilkan pesan penutupan aplikasi.

#### Expected Output:

```text
Aplikasi ditutup.
```


## Kriteria

- Sudah disediakan fitur login, silakan implementasikan fitur yang diminta.
- Output tidak harus sama persis, namun ketentuan harus sesuai dengan yang diminta.
- Pengumpulan dalam bentuk ZIP dari project yang dibuat serta screenshot dari outputnya.
- Untuk screenshot adalah semua dari fitur yang diminta diatas dengan input sebebas kalian.

## Struktur Kelas

Diagram berikut menunjukkan struktur kelas yang saat ini digunakan dalam aplikasi ini:

<img src="diagram.png" width="2264" alt="Class Diagram"/>