# Jobsheet 7: Perulangan (Loops) - Pertanyaan dan Jawaban

Repository ini berisi jawaban untuk pertanyaan-pertanyaan yang ada pada Jobsheet 7 - Perulangan 1.

---

## 2.1 Percobaan 1: Perulangan FOR

### 2.1.3 Pertanyaan

**1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!**

* **Jawaban:**
    * **Inisialisasi (Initialization):** `int i = 1`
        * Bagian ini dieksekusi pertama kali dan hanya sekali. Ini menginisialisasi variabel kontrol loop `i` dengan nilai 1.
    * **Kondisi (Condition):** `i <= 10`
        * Bagian ini dievaluasi sebelum setiap iterasi. Jika kondisi `true`, tubuh loop akan dieksekusi. Jika `false`, loop berhenti.
    * **Update (Increment):** `i++`
        * Bagian ini dieksekusi di akhir setiap iterasi. Ini memperbarui variabel kontrol loop (dalam hal ini, menambah `i` sebesar 1).

**2. Mengapa variabel `tertinggi` diinisialisasi 0 dan `terendah` diinisialisasi 100? Apa yang terjadi jika variabel `tertinggi` diinisialisasi 100 dan `terendah` diinisialisasi 0?**

* **Jawaban:**
    * Tujuannya adalah untuk **memastikan nilai mahasiswa pertama yang di-input pasti akan menjadi nilai `tertinggi` dan `terendah` sementara**.
    * Dengan asumsi nilai kuis valid (0-100), nilai pertama yang dimasukkan (misal: 76.5) pasti akan:
        * Lebih besar dari `0` (sehingga `tertinggi` diperbarui).
        * Lebih kecil dari `100` (sehingga `terendah` diperbarui).
    * **Jika dibalik (`tertinggi = 100`, `terendah = 0`):** Jika semua nilai mahasiswa berada di antara 0 dan 100 (misal: 55.3 s/d 90.1), maka:
        * Kondisi `nilai > 100` tidak akan pernah `true`. Nilai `tertinggi` akan tetap 100.
        * Kondisi `nilai < 0` tidak akan pernah `true`. Nilai `terendah` akan tetap 0.
    * Hasil akhirnya akan salah (menampilkan 100 dan 0), bukan nilai tertinggi/terendah yang sebenarnya dari input.

**3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!**
    ```java
    if (nilai > tertinggi) {
        tertinggi = nilai;
    }
    if (nilai < terendah) { // (Berdasarkan flowchart)
        terendah = nilai;
    }
    ```
* **Jawaban:**
    * Potongan kode tersebut berfungsi sebagai **mekanisme pembaruan (update)** untuk variabel `tertinggi` dan `terendah` setiap kali ada nilai baru yang dimasukkan.
    * **Alur Kerja:**
        1.  **Blok `if` pertama:** Mengecek apakah `nilai` yang baru di-input lebih besar dari `tertinggi` yang tersimpan saat ini. Jika `true`, maka `tertinggi` akan diperbarui (ditimpa) dengan `nilai` baru tersebut.
        2.  **Blok `if` kedua:** Mengecek apakah `nilai` yang baru di-input lebih kecil dari `terendah` yang tersimpan saat ini. Jika `true`, maka `terendah` akan diperbarui dengan `nilai` baru tersebut.
    * Kedua `if` ini sengaja dibuat terpisah (bukan `if-else`) agar setiap nilai baru selalu dicek untuk kedua kemungkinan (apakah dia yang tertinggi *DAN* apakah dia yang terendah).

**4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).**

* **Jawaban:**
    * Modifikasi dilakukan dengan menambahkan dua variabel counter (misal: `jmlLulus` dan `jmlTidakLulus`) sebelum loop, dan menambahkan struktur `if-else` di dalam loop.

    ```java
    // 1. Tambahkan variabel counter sebelum loop
    double nilai, tertinggi = 0, terendah = 100;
    int jmlLulus = 0, jmlTidakLulus = 0; // TAMBAHAN

    for (int i = 1; i <= 10; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();

        // 2. Tambahkan pengecekan lulus/tidak lulus di dalam loop
        if (nilai >= 60) { // TAMBAHAN
            jmlLulus++;
        } else {
            jmlTidakLulus++;
        }

        // ... (kode pengecekan tertinggi/terendah tetap sama) ...
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }
    }

    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    
    // 3. Tampilkan hasil counter setelah loop
    System.out.println("Jumlah mahasiswa lulus: " + jmlLulus); // TAMBAHAN
    System.out.println("Jumlah mahasiswa tidak lulus: " + jmlTidakLulus); // TAMBAHAN
    ```

---

## 2.2 Percobaan 2: Perulangan WHILE

### 2.2.3 Pertanyaan

**1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:**
    ```java
    if (nilai < 0 || nilai > 100) {
        System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
        continue;
    }
    ```
    **a. `nilai < 0 || nilai > 100`**
    **b. `continue`**

* **Jawaban:**
    * **a. `nilai < 0 || nilai > 100`**:
        * **Maksud:** Ini adalah ekspresi logika untuk **validasi input**. `||` adalah operator "ATAU" (OR).
        * **Kegunaan:** Kondisi ini akan bernilai `true` jika `nilai` yang dimasukkan kurang dari 0 (negatif) ATAU `nilai` yang dimasukkan lebih dari 100. Ini digunakan untuk menangkap input yang berada di luar rentang nilai yang valid (0-100).
    * **b. `continue`**:
        * **Maksud:** Ini adalah perintah kontrol perulangan.
        * **Kegunaan:** Perintah `continue` memaksa perulangan untuk **menghentikan iterasi (putaran) saat ini** dan langsung **melompat ke awal iterasi berikutnya** (kembali ke pengecekan kondisi `while (i < jml)`). Dalam konteks ini, jika nilai tidak valid, `continue` akan dieksekusi. Ini menyebabkan program melewatkan sisa kode di dalam loop (yaitu blok `if-else if` untuk grading nilai dan `i++`), dan langsung meminta input ulang (karena `i` tidak bertambah).

**2. Mengapa sintaks `i++` dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?**

* **Jawaban:**
    * `i++` adalah komponen *update* untuk variabel counter `i`. Ia ditulis di akhir (setelah blok validasi dan grading) agar `i` (yang menghitung jumlah mahasiswa) **hanya bertambah jika input nilai sudah dipastikan valid dan selesai diproses**.
    * Jika `continue` dieksekusi (karena nilai tidak valid), `i++` yang ada di akhir akan terlewat. Ini adalah perilaku yang diinginkan, agar program meminta nilai untuk mahasiswa `i` yang sama.
    * **Jika ditulis di awal `while`:**
        1.  Nilai `i` akan langsung menjadi 1 pada iterasi pertama *sebelum* input diminta.
        2.  Output pertama akan salah, menjadi "Masukkan nilai mahasiswa ke-2" (karena `(i+1)` menjadi `(1+1)`), bukan "mahasiswa ke-1".
        3.  Jika pengguna memasukkan nilai tidak valid, `i` akan tetap bertambah, sehingga program tidak akan meminta ulang nilai untuk mahasiswa yang sama, melainkan lanjut ke mahasiswa berikutnya.

**3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?**

* **Jawaban:**
    * Kondisi perulangan adalah `while (i < jml)`. `i` dimulai dari `0` dan `jml` adalah `19`.
    * Loop akan berjalan untuk `i = 0`, `i = 1`, `i = 2`, ..., hingga `i = 18`.
    * Ketika `i` menjadi 19, kondisi `19 < 19` akan bernilai `false`, dan perulangan berhenti.
    * Jadi, perulangan akan berjalan sebanyak **19 kali** (dengan asumsi semua nilai yang dimasukkan valid pada percobaan pertama).

**4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!**

* **Jawaban:**
    * Modifikasi dilakukan dengan menambahkan satu baris `System.out.println()` di dalam blok `if` yang mengecek nilai A.

    ```java
    // ... (kode if-else if sebelumnya)
    if (nilai > 80 && nilai <= 100) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
        System.out.println("Bagus, pertahankan nilainya!"); // TAMBAHAN
    } else if (nilai > 73 && nilai <= 80) {
    // ... (sisa kode else if)
    ```

---

## 2.3 Percobaan 3: Perulangan DO-WHILE

### 2.3.3 Pertanyaan

**1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah "batal", maka berapa kali perulangan dilakukan?**

* **Jawaban:**
    * **Satu kali.**
    * Perulangan `do-while` memiliki karakteristik unik: blok `do` **dieksekusi minimal satu kali** sebelum kondisi `while` dicek.
    * Program akan masuk blok `do`, meminta nama pelanggan. Jika "batal" dimasukkan, `if` akan `true`, dan perintah `break;` akan dieksekusi, yang langsung menghentikan perulangan.

**2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!**

* **Jawaban:**
    * Kondisi berhenti (terminasi) adalah **input "batal" dari pengguna**.
    * Secara teknis, perulangan dihentikan oleh perintah `break;` yang dieksekusi ketika kondisi `if (namaPelanggan.equalsIgnoreCase("batal"))` bernilai `true`.

**3. Apa fungsi dari penggunaan nilai `true` pada kondisi DO-WHILE?**

* **Jawaban:**
    * Penggunaan `while(true)` berfungsi untuk menciptakan **infinite loop (perulangan tak terbatas)** secara sengaja.
    * Ini membuat perulangan terus berjalan tanpa henti. Perulangan ini dirancang untuk tidak berhenti berdasarkan kondisi `while`, melainkan berhenti berdasarkan kondisi internal di dalam `do` (yaitu perintah `break;`).

**4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?**

* **Jawaban:**
    * Karena perulangan ini **bukan *counter-controlled loop*** (perulangan yang dikontrol oleh counter, seperti `for (int i=0; ...)`).
    * Ini adalah ***sentinel-controlled loop***. Perulangan tidak bergantung pada variabel counter yang di-update (seperti `i++`). Perulangan ini berjalan terus menerus (`while(true)`) dan hanya akan berhenti ketika *nilai sentinel* (nilai khusus) dimasukkan oleh pengguna, yang dalam kasus ini adalah "batal".

---

## 3. Tugas

### Tugas 1: Program Penjualan Tiket Bioskop

> Buat program untuk menghitung total penjualan tiket bioskop (Rp 50.000/tiket).
> - Diskon 10% jika beli > 4 tiket.
> - Diskon 15% jika beli > 10 tiket.
> - Input negatif diabaikan (minta input ulang).
> - Program harus menghitung total tiket terjual dan total harga penjualan.

* **Jawaban (Kode Program):**

```java
import java.util.Scanner;

public class BioskopTugasNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket, totalTiketHarian = 0;
        double totalPenjualanHarian = 0;
        int hargaPerTiket = 50000;

        System.out.println("--- Program Penjualan Tiket Bioskop ---");
        System.out.println("(Masukkan jumlah 0 untuk mengakhiri)");

        // Menggunakan do-while(true) agar bisa berhenti kapan saja
        do {
            System.out.print("\nMasukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();

            // 1. Kondisi Berhenti (Sentinel)
            if (tiket == 0) {
                break; 
            }

            // 2. Validasi Input Negatif
            if (tiket < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah yang benar.");
                continue; // Mengabaikan input dan kembali ke awal loop
            }

            double hargaAwal = (double) tiket * hargaPerTiket;
            double diskon = 0;

            // 3. Pengecekan Diskon
            if (tiket > 10) {
                diskon = 0.15; // 15%
            } else if (tiket > 4) {
                diskon = 0.10; // 10%
            }

            double hargaAkhir = hargaAwal - (hargaAwal * diskon);

            System.out.println("Harga Awal: Rp " + hargaAwal);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total yang harus dibayar: Rp " + hargaAkhir);
            
            // 4. Akumulasi Total Harian
            totalTiketHarian += tiket;
            totalPenjualanHarian += hargaAkhir;

        } while (true);

        // Menampilkan total harian setelah loop berhenti
        System.out.println("\n--- Rekap Penjualan Harian ---");
        System.out.println("Total tiket terjual: " + totalTiketHarian + " tiket");
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualanHarian);
    }
}   