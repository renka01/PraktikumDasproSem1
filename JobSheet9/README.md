# Jawaban Pertanyaan Jobsheet 9: Array 1

Repository ini berisi jawaban dan modifikasi kode untuk Pertanyaan pada Jobsheet 9 - Array 1.

---

## Percobaan 1: Mengisi Elemen Array

### Pertanyaan 1.1
> Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? [cite_start]Mengapa bisa demikian? [cite: 31]

* **Apa yang terjadi:** Program akan mengalami **error saat kompilasi** (*compile-time error*).
* [cite_start]**Mengapa:** Array `bil` dideklarasikan dengan tipe data `int[]` (integer)[cite: 12], yang hanya dapat menyimpan bilangan bulat. Nilai `5.0` dan `7.5` adalah bilangan desimal (tipe `double` atau `float`). Java adalah bahasa yang *strongly-typed*, sehingga Anda tidak bisa memasukkan nilai `double` ke dalam variabel `int` tanpa konversi paksa (casting) karena ada potensi kehilangan data.

### Pertanyaan 1.3
> [cite_start]Ubah statement pada langkah No 4 menjadi seperti berikut...[cite: 38]. Apa keluaran dari program? Jelaskan maksud dari statement tersebut.

* [cite_start]**Keluaran Program:** Outputnya akan **sama persis** dengan langkah 4 [cite: 21-24], yaitu:
    ```
    5
    13
    -7
    17
    ```
* **Maksud Statement:** Statement `for` tersebut adalah perulangan (loop) yang berfungsi untuk mengakses setiap elemen array secara berurutan.
    * `int i=0;`: Memulai variabel penghitung `i` dari 0 (indeks pertama array).
    * `i<4;`: Perulangan akan terus berjalan selama `i` kurang dari 4 (yaitu untuk `i` = 0, 1, 2, dan 3).
    * `i++`: Menambah nilai `i` sebesar 1 setiap kali satu putaran loop selesai.
    * `System.out.println(bil[i]);`: Mencetak nilai array `bil` pada indeks ke-`i`.

### Pertanyaan 1.4
> Jika kondisi pada statement for-loop di atas diubah menjadi: `i<=4`, apa keluaran dari program? [cite_start]Mengapa demikian? [cite: 43]

* **Keluaran Program:** Program akan mencetak empat nilai pertama (5, 13, -7, 17), kemudian akan **crash** dan menampilkan error **`java.lang.ArrayIndexOutOfBoundsException`**.
* **Mengapa:** Array `bil` memiliki 4 elemen, yang berarti indeks yang valid adalah 0, 1, 2, dan 3. Kondisi `i <= 4` membuat loop berjalan sebanyak 5 kali (untuk `i` = 0, 1, 2, 3, **dan 4**). Ketika loop mencoba mengakses `bil[4]`, program gagal karena tidak ada elemen array di indeks ke-4.

---

## Percobaan 2: Studi Kasus Nilai Mahasiswa

### Pertanyaan 2.1
> [cite_start]Ubah statement pada langkah nomor 5 menjadi... `i < nilaiAkhir.length`...[cite: 81]. Apakah terjadi perubahan? Mengapa demikian?

* **Apakah terjadi perubahan:** **Tidak ada perubahan** pada output atau cara kerja program.
* **Mengapa:** `nilaiAkhir.length` adalah sebuah *property* (atribut) dari array yang mengembalikan total kapasitas array tersebut. [cite_start]Karena array `nilaiAkhir` dideklarasikan dengan `new int[10]` [cite: 50][cite_start], maka `nilaiAkhir.length` memiliki nilai 10. Kondisi `i < 10` [cite: 52] [cite_start]dan `i < nilaiAkhir.length` [cite: 81] adalah hal yang sama (secara fungsional ekuivalen) dalam kasus ini.

### Pertanyaan 2.2
> [cite_start]Apa yang dimaksud dengan kondisi: `i < nilaiAkhir.length`? [cite: 85]

* **Maksud Kondisi:** Kondisi ini berarti **"perulangan akan terus berlanjut selama nilai `i` (indeks) masih kurang dari total jumlah elemen dalam array `nilaiAkhir`"**. Ini adalah cara standar untuk mengakses semua elemen dalam array, karena indeks array di Java dimulai dari 0 dan berakhir di `length - 1`.

### Pertanyaan 2.3
> [cite_start]Ubah statement pada langkah nomor 6... [agar] hanya menampilkan nilai Mahasiswa yang lulus saja (> 70) [cite: 86-88]. Jalankan program dan jelaskan alur program!

* **Alur Program:**
    1.  Program memulai perulangan `for` untuk mengecek setiap elemen, dimulai dari indeks `i = 0` hingga `i < nilaiAkhir.length`.
    2.  [cite_start]Di setiap putaran, program mengambil nilai `nilaiAkhir[i]` dan memeriksanya dengan kondisi `if (nilaiAkhir[i] > 70)`[cite: 89].
    3.  [cite_start]**Jika** nilai tersebut lebih besar dari 70, program akan mencetak "Mahasiswa ke-X lulus!"[cite: 90].
    4.  **Jika** nilai tersebut 70 atau lebih kecil, kondisi `if` tidak terpenuhi, dan program tidak melakukan apa-apa (melewatkan pencetakan).
    5.  Program melanjutkan ke iterasi `i` berikutnya sampai semua elemen selesai diperiksa.

---

## Percobaan 4: Searching

### Pertanyaan 4.1
> [cite_start]Jelaskan maksud dari statement `break;` pada baris ke-10 kode program percobaan 4 di atas. [cite: 207]

* [cite_start]**Maksud Statement:** Statement `break;` [cite: 191] [cite_start]berfungsi untuk **menghentikan paksa** perulangan `for` [cite: 185] saat itu juga. [cite_start]Dalam program pencarian ini, ketika nilai yang dicari (`key`) sudah ditemukan (`if (key == arrNilai[i])` [cite: 186]), program tidak perlu lagi melanjutkan pencarian ke sisa elemen array. `break` digunakan untuk keluar dari loop dan membuat program lebih efisien.