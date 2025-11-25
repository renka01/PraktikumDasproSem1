# Laporan Praktikum Jobsheet 12 - Fungsi
**Nama:** [Faren Hafiza Afanda]
**NIM:** [254107020025]
**No Absen:** 15
**Kelas:** [TI-C]

## 2.1 Percobaan 1: Fungsi Tanpa Parameter

**Pertanyaan & Jawaban:**
1. **Apakah fungsi tanpa parameter selalu harus bertipe void?**
   *Jawaban:* Tidak selalu. Fungsi tanpa parameter juga bisa memiliki tipe data kembalian (return type) seperti `int`, `String`, dll, jika fungsi tersebut bertujuan untuk mengembalikan suatu nilai tanpa memerlukan input dari luar.

2. **Apakah daftar menu dapat ditampilkan tanpa fungsi `Menu()`?**
   *Jawaban:* Ya, bisa. Kita bisa menuliskan perintah `System.out.println` langsung di dalam blok `main`.

3. **Keuntungan menggunakan fungsi `Menu()`:**
   *Jawaban:*
   * **Reusability:** Kode menu bisa dipanggil berulang kali tanpa menulis ulang.
   * **Readability:** Struktur kode di `main` menjadi lebih rapi dan mudah dibaca.
   * **Modularity:** Memudahkan perbaikan jika ada perubahan pada daftar menu (hanya ubah di satu tempat).

4. **Alur eksekusi `Menu()`:**
   *Jawaban:* Program mulai dari `main` -> memanggil `Menu()` -> kontrol pindah ke fungsi `Menu` -> menjalankan semua baris print di dalam `Menu` -> setelah selesai, kontrol kembali ke baris setelah pemanggilan fungsi di `main`.

---

## 2.2 Percobaan 2: Fungsi Dengan Parameter

**Pertanyaan & Jawaban:**
1. **Kegunaan parameter:**
   *Jawaban:* Untuk menyalurkan data (input) dari luar ke dalam fungsi agar dapat diproses secara dinamis.

2. **Mengapa `Menu()` butuh parameter `namaPelanggan` dan `isMember`?**
   *Jawaban:* Agar fungsi dapat menyapa pelanggan secara personal (menyebut nama) dan mengecek status member untuk menentukan logika diskon yang berbeda-beda tiap orang.

3. **Apakah parameter sama dengan variabel?**
   *Jawaban:* Parameter adalah variabel khusus yang didefinisikan di deklarasi fungsi untuk menerima input. Variabel biasa didefinisikan di dalam blok kode untuk menyimpan data lokal.

4. **Cara kerja `isMember`:**
   *Jawaban:* Jika `isMember` bernilai `true`, program masuk ke blok `if` dan mencetak info diskon. Jika `false`, blok `if` dilewati.

5. **Jika memanggil `Menu()` tanpa parameter:**
   *Jawaban:* Akan terjadi **Compile Error** karena jumlah dan tipe argumen tidak cocok dengan definisi fungsi.

6. **(Implementasi Kode Promo)**
   *Jawaban:* (Lihat kode program `Kafe15.java` yang telah dimodifikasi).

7. **Pemanggilan fungsi untuk Budi:**
   *Jawaban:* `Menu("Budi", true, "DISKON30");` (Asumsi fungsi sudah dimodifikasi menerima parameter ke-3).

8. **Apakah parameter membuat lebih mudah dibaca?**
   *Jawaban:* Ya, karena kita bisa melihat dengan jelas data apa yang dibutuhkan fungsi untuk bekerja, dan kita tidak perlu menumpuk deklarasi variabel global.

---

## 2.3 Percobaan 3: Fungsi dengan Nilai Kembalian

**Pertanyaan & Jawaban:**
1. **Kapan butuh return value vs void?**
   * **Return value:** Saat hasil proses fungsi akan digunakan untuk perhitungan selanjutnya (Contoh: `hitungTotalHarga` mengembalikan angka untuk ditampilkan atau dijumlahkan).
   * **Void:** Saat fungsi hanya melakukan aksi seperti mencetak ke layar (Contoh: `Menu` menampilkan daftar teks).

2. **Analisis `hitungTotalHargaNoAbsen`:**
   * **Tipe kembalian:** `int` (karena harga berupa bilangan bulat).
   * **Parameter:** `pilihanMenu` (indeks menu yang dipilih) dan `banyakItem` (jumlah pesanan).

3. **(Modifikasi Kode Promo)**
   *Jawaban:* (Lihat kode program `Kafe15.java` pada method `hitungTotalHarga`).

4. **(Modifikasi Pesan Banyak Menu)**
   *Jawaban:* Menggunakan *looping* di dalam `main` yang terus meminta input sampai user memilih keluar, lalu mengakumulasi total harga.

---

## 2.4 Percobaan 4: Fungsi Varargs

**Pertanyaan & Jawaban:**
1. **Mengapa `String...`?**
   *Jawaban:* Itu adalah sintaks **Variable Arguments (Varargs)**, yang memungkinkan fungsi menerima jumlah argumen yang dinamis (bisa 0, 1, atau banyak string) yang dianggap sebagai array.

2. **Modifikasi dengan for-each:**
   *Jawaban:*
   ```java
   for (String nama : namaPengunjung) {
       System.out.println("- " + nama);
   }