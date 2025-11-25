# Laporan Praktikum Jobsheet 11 - Array 2

**Nama:** [Faren Hafiza Afanda]
**NIM:** [254107020025]
**Kelas:** [TI 1-C]
**No. Absen:** 15

---

## 2.1 Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

### Pertanyaan dan Jawaban

1.  **Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!**
    * **Jawab:** Tidak harus. Pengisian elemen array dapat dilakukan secara acak pada indeks berapapun selama indeks tersebut masih berada di dalam batas (indeks valid) dari ukuran array yang telah dideklarasikan.

2.  **Mengapa terdapat null pada daftar nama penonton?**
    * **Jawab:** Karena pada kode program awal, elemen array pada baris indeks ke-3 dan kolom indeks ke-1 (`penonton[3][1]`) belum diinisialisasi atau belum diisi dengan data String. Secara default, elemen array bertipe objek (seperti String) yang tidak diisi akan bernilai `null`.

3.  **Lengkapi daftar penonton pada langkah ke-4.**
    * *(Kode program telah dilengkapi di file `Bioskop15.java`)*.

4.  **Jelaskan fungsi dari `penonton.length` dan `penonton[0].length`!**
    * **Jawab:**
        * `penonton.length`: Berfungsi untuk mengetahui jumlah baris (panjang array dimensi pertama) dari array `penonton` (bernilai 4).
        * `penonton[0].length`: Berfungsi untuk mengetahui jumlah kolom (panjang array dimensi kedua) pada baris ke-0 (bernilai 2).
    * **Apakah `penonton[0].length`, `penonton[1].length`, dst memiliki nilai yang sama?**
        * Ya, dalam kasus ini nilainya sama karena array dideklarasikan secara persegi (`new String[4][2]`), sehingga setiap baris memiliki jumlah kolom yang sama.

5.  **Modifikasi kode program untuk menampilkan panjang setiap baris menggunakan for loop.**
    * *(Telah diimplementasikan di `Bioskop15.java`)*.

6.  **Modifikasi kode program menggunakan foreach loop.**
    * *(Telah diimplementasikan di `Bioskop15.java`)*.

7.  **Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3.**
    * *(Telah diimplementasikan di `Bioskop15.java`)*.

8.  **Modifikasi menjadi perulangan dengan foreach loop.**
    * *(Telah diimplementasikan di `Bioskop15.java`)*.

9.  **Modifikasi kembali untuk menampilkan nama penonton setiap baris.**
    * *(Telah diimplementasikan di `Bioskop15.java`)*.

10. **Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?**
    * **Jawab:**
        * **Kelebihan Foreach:** Sintaks lebih sederhana, lebih mudah dibaca, dan mengurangi risiko kesalahan pengaksesan indeks (*index out of bounds*).
        * **Kekurangan Foreach:** Tidak dapat mengakses indeks secara langsung (jika kita membutuhkan nomor urut data), dan bersifat *read-only* (tidak bisa digunakan untuk mengubah isi elemen array secara langsung).

11. **Berapa indeks baris maksimal untuk array penonton?**
    * **Jawab:** 3 (Karena panjang baris adalah 4, maka indeksnya 0, 1, 2, 3).

12. **Berapa indeks kolom maksimal untuk array penonton?**
    * **Jawab:** 1 (Karena panjang kolom adalah 2, maka indeksnya 0, 1).

13. **Apa fungsi dari `String.join()`?**
    * **Jawab:** Method ini berfungsi untuk menggabungkan elemen-elemen (biasanya dari array atau koleksi string) menjadi satu kesatuan String utuh, dengan menggunakan *delimiter* (pemisah) tertentu yang ditentukan di parameter pertama (misalnya koma `", "`).

---

## 2.2 Percobaan 2: Memanfaatkan Scanner dan Perulangan

### Pertanyaan dan Jawaban

1.  **Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!**
    * **Jawab:** Tidak. Pengguna bebas memasukkan koordinat baris dan kolom mana saja yang ingin diisi terlebih dahulu, asalkan koordinat tersebut valid (tersedia dalam array).

2.  **Modifikasi kode program untuk memberikan opsi menu.**
    * *(Telah diimplementasikan di `BioskopWithScanner15.java`)*.

3.  **Modifikasi kode program untuk menghandle baris/kolom yang tidak tersedia.**
    * *(Telah diimplementasikan di `BioskopWithScanner15.java` dengan validasi `if`).*

4.  **Modifikasi kode program untuk memberikan warning apabila kursi sudah terisi.**
    * *(Telah diimplementasikan di `BioskopWithScanner15.java` dengan pengecekan `!= null`).*

5.  **Pada menu 2, jika kursi kosong, ganti null dengan ***.**
    * *(Telah diimplementasikan di `BioskopWithScanner15.java`).*

---

## 2.3 Percobaan 3: Array 2 Dimensi dengan Length Baris Berbeda

### Pertanyaan dan Jawaban

1.  **Tambahkan kode program untuk menampilkan array.**
    * *(Telah diimplementasikan di `Numbers15.java`)*.

2.  **Apa fungsi dari `Arrays.toString()`?**
    * **Jawab:** Fungsi ini digunakan untuk mengonversi isi array menjadi representasi String yang mudah dibaca (misalnya format `[nilai1, nilai2, ...]`), sehingga kita bisa mencetak isi array 1 dimensi tanpa harus membuat perulangan manual.

3.  **Apa nilai default untuk elemen pada array dengan tipe data int?**
    * **Jawab:** 0.

4.  **Tambahkan kode program untuk melihat panjang baris.**
    * *(Telah diimplementasikan di `Numbers15.java`)*.

5.  **Apakah panjang array dapat dimodifikasi setelah diinstansiasi?**
    * **Jawab:** Tidak. Di Java, ukuran array bersifat *fixed* (tetap) setelah pertama kali dibuat dengan keyword `new`. Kita tidak bisa menambah atau mengurangi panjangnya secara dinamis. Jika ingin mengubah ukuran, kita harus membuat objek array baru.

---

## 2.4 Percobaan 4: Studi Kasus SIAKAD

### Pertanyaan dan Jawaban

1.  **Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan mata kuliah yang dinamis.**
    * **Jawab:** Jika jumlah siswa dan mata kuliah berubah, program harus dimodifikasi untuk menerima input jumlah tersebut di awal, lalu membuat array dengan ukuran `new int[jmlSiswa][jmlMatkul]`. Implementasi kode ada di file `SIAKAD15.java`.

### Pseudocode SIAKAD Dinamis (Modifikasi)

```text
ALGORITMA SiakadDinamis
DEKLARASI:
    jmlSiswa, jmlMatkul : INTEGER
    i, j : INTEGER
    totalPerSiswa, totalPerMatkul : DOUBLE
    nilai[][] : INTEGER (Array 2 Dimensi)

DESKRIPSI:
    1.  START
    2.  PRINT "Masukkan jumlah mahasiswa: "
    3.  READ jmlSiswa
    4.  PRINT "Masukkan jumlah mata kuliah: "
    5.  READ jmlMatkul
    
    6.  INSTANSIASI nilai = new INTEGER[jmlSiswa][jmlMatkul]

    // Input Data Nilai
    7.  FOR i FROM 0 TO (jmlSiswa - 1) DO
            PRINT "Input nilai mahasiswa ke-" + (i+1)
            FOR j FROM 0 TO (jmlMatkul - 1) DO
                PRINT "Nilai mata kuliah " + (j+1) + ": "
                READ nilai[i][j]
            END FOR
        END FOR

    // Menghitung & Menampilkan Rata-rata Per Mahasiswa
    8.  PRINT "--- Rata-rata Nilai per Siswa ---"
    9.  FOR i FROM 0 TO (jmlSiswa - 1) DO
            totalPerSiswa = 0
            FOR j FROM 0 TO (jmlMatkul - 1) DO
                totalPerSiswa = totalPerSiswa + nilai[i][j]
            END FOR
            rataSiswa = totalPerSiswa / jmlMatkul
            PRINT "Mahasiswa ke-" + (i+1) + ": " + rataSiswa
        END FOR

    // Menghitung & Menampilkan Rata-rata Per Mata Kuliah
    10. PRINT "--- Rata-rata Nilai per Mata Kuliah ---"
    11. FOR j FROM 0 TO (jmlMatkul - 1) DO
            totalPerMatkul = 0
            FOR i FROM 0 TO (jmlSiswa - 1) DO
                totalPerMatkul = totalPerMatkul + nilai[i][j]
            END FOR
            rataMatkul = totalPerMatkul / jmlSiswa
            PRINT "Mata Kuliah " + (j+1) + ": " + rataMatkul
        END FOR

    12. END