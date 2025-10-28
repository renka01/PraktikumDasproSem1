# Jobsheet 8: Perulangan 2 (Nested Loops) - Pertanyaan dan Jawaban

Repository ini berisi jawaban untuk pertanyaan-pertanyaan yang ada pada Jobsheet 8 - Perulangan 2.

---

## 2.1 Percobaan 1: Review Perulangan 1

### 2.1.3 Pertanyaan

**1. Jika pada perulangan for, inisialisasi `i=1` diubah menjadi `i=0`, apa akibatnya? [cite_start]Mengapa bisa demikian?** [cite: 318]

* **Jawaban:**
    * **Akibat:** Program akan mencetak bintang (`*`) sebanyak **n + 1** kali.
    * [cite_start]**Alasan:** Perulangan berjalan selama `i <= n`[cite: 305]. Jika `i` dimulai dari 0, maka loop akan dieksekusi untuk `i = 0, 1, 2, ...` hingga `n`. Ini totalnya `n+1` iterasi. (Misal `n=5`, loop berjalan untuk i=0, 1, 2, 3, 4, 5, yaitu 6 kali).

**2. Jika pada perulangan for, kondisi `i<=n` diubah menjadi `i<n`, bagaimana bentuk outputnya jika input `n=5`? [cite_start]Mengapa hasilnya berbeda?** [cite: 319]

* **Jawaban:**
    * **Output:** `****` (4 bintang).
    * **Alasan:** Perulangan berjalan selama `i < n`. Dengan `n=5` dan `i` mulai dari 1, loop akan berjalan untuk `i = 1, 2, 3, 4`. Ketika `i` menjadi 5, kondisi `5 < 5` bernilai `false`, sehingga perulangan berhenti. Loop hanya berjalan 4 kali.

**3. [cite_start]Jika pada perulangan for, kondisi `i <= n` diubah menjadi `i > n` (asumsi typo 'in' [cite: 320]), apa akibatnya? [cite_start]Mengapa bisa demikian?** [cite: 320]

* **Jawaban:**
    * **Akibat:** Program **tidak akan mencetak bintang sama sekali** (output kosong).
    * [cite_start]**Alasan:** Dengan inisialisasi `i=1` [cite: 305] dan `n=5` (contoh), kondisi `i > n` (yaitu `1 > 5`) akan langsung bernilai `false` pada pengecekan pertama. Perulangan tidak akan pernah dieksekusi.

**4. Jika pada perulangan for, kondisi step `i++` diubah menjadi `i--` apa akibatnya? [cite_start]Mengapa bisa demikian?** [cite: 321]

* **Jawaban:**
    * **Akibat:** Terjadi **infinite loop** (perulangan tak terbatas). Program akan terus-menerus mencetak `*`.
    * [cite_start]**Alasan:** `i` dimulai dari 1 [cite: 305] [cite_start]dan kondisi berhentinya adalah `i <= n` [cite: 305] (misal `n=5`). Step `i--` akan membuat nilai `i` terus berkurang (1, 0, -1, -2, ...). Karena nilai `i` akan *selalu* lebih kecil atau sama dengan `n`, kondisi `i <= n` akan *selalu* `true`, dan loop tidak akan pernah berhenti.

**5. Jika pada perulangan for, step `i++` diubah menjadi `i+=2` bagaimana pola outputnya jika input `n=6`? [cite_start]Apa yang menyebabkan perubahan tersebut?** [cite: 322]

* **Jawaban:**
    * **Output:** `***` (3 bintang).
    * **Alasan:** Perubahan ini disebabkan oleh **step increment** yang diubah menjadi 2. Loop akan berjalan untuk `i = 1`, `i = 3`, dan `i = 5`. [cite_start]Ketika `i` menjadi 7 (`5 + 2`), kondisi `7 <= 6` (`i <= n`) [cite: 305] bernilai `false`, dan loop berhenti. Loop hanya tereksekusi 3 kali.

---

## 2.2 Percobaan 2: Bintang Persegi

### 2.2.3 Pertanyaan

**1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi `iOuter=1` diubah menjadi `iOuter=0`, apa yang akibatnya? [cite_start]Mengapa bisa demikian?** [cite: 368]

* **Jawaban:**
    * **Akibat:** Program akan mencetak **N + 1 baris** bintang (bukan N baris).
    * [cite_start]**Alasan:** Perulangan luar (`outer loop`) akan berjalan selama `iOuter <= N`[cite: 354]. Jika `iOuter` dimulai dari 0, maka loop akan berjalan untuk `iOuter = 0, 1, 2, ...` hingga `N`. Ini totalnya `N+1` iterasi, sehingga menghasilkan `N+1` baris.

**2. Kembalikan program semula. Perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi `i=1` diubah menjadi `i=0`, apa yang akibatnya? [cite_start]Mengapa bisa demikian?** [cite: 370]

* **Jawaban:**
    * **Akibat:** Program akan mencetak **N + 1 kolom** bintang di setiap baris (misal `N=5`, outputnya `******`).
    * [cite_start]**Alasan:** Perulangan dalam (`inner loop`) akan berjalan selama `i <= N`[cite: 357]. Jika `i` dimulai dari 0, loop akan dieksekusi `N+1` kali untuk setiap baris.

**3. [cite_start]Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?** [cite: 372]

* **Jawaban:**
    * **Perulangan Luar (Outer Loop):** Mengontrol **jumlah baris** (repetisi vertikal).
    * **Perulangan Dalam (Inner Loop):** Mengontrol **apa yang dicetak dalam satu baris** (repetisi horizontal), seperti jumlah kolom atau bintang.

**4. Mengapa perlu ditambahkan sintaks `System.out.println();` di bawah perulangan dalam? [cite_start]Apa akibatnya jika sintaks tersebut dihilangkan?** [cite: 373]

* **Jawaban:**
    * [cite_start]**Alasan:** Perintah `System.out.println();` [cite: 359] berfungsi untuk **memindahkan kursor ke baris baru** setelah perulangan dalam (satu baris penuh bintang) selesai dicetak.
    * **Akibat Jika Dihilangkan:** Semua bintang akan dicetak **dalam satu baris yang sangat panjang**. (Misal `N=5`, outputnya `*************************`).

---

## 2.3 Percobaan 3: Bintang Segitiga

### 2.3.3 Pertanyaan

**1. [cite_start]Perhatikan, apakah output yang dihasilkan dengan nilai `n=5` sesuai dengan tampilan berikut?** [cite: 403, 404, 405, 406, 407, 408]

* **Jawaban:** **Tidak**. [cite_start]Kode asli [cite: 392-400] tidak memiliki `System.out.println()` di dalam *outer loop*. Akibatnya, semua bintang (`*`, `**`, `***`, `****`, `*****`) akan tercetak dalam satu baris yang sama.

**2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? [cite_start]Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.** [cite: 409]

* **Jawaban:**
    * **Perbaikan Utama:** Menambahkan `System.out.println();`
    * [cite_start]**Lokasi:** Perintah ini harus ditambahkan **setelah** *inner loop* `while (j<i)` selesai [cite: 398][cite_start], tetapi **sebelum** *outer loop* selesai (sebelum `i++` [cite: 399]).
    * **Penjelasan:** Fungsinya untuk pindah ke baris baru setelah selesai mencetak bintang di satu baris (misal, setelah `***` selesai dicetak, kursor pindah ke baris baru untuk mencetak `****`).

**3. Jelaskan peran masing-masing variabel `i` dan `j` dalam program ini. Mengapa `j` di-set ulang ke 0 di awal setiap iterasi outer loop? [cite_start]Apa yang akan terjadi jika `j` tidak di-reset?** [cite: 411]

* **Jawaban:**
    * **Peran `i` (Outer Loop):** Mengontrol **baris**. [cite_start]Variabel `i` juga digunakan sebagai batas kondisi *inner loop* (`j<i` [cite: 395]), yang menentukan **jumlah bintang yang harus dicetak** di baris tersebut.
    * **Peran `j` (Inner Loop):** Mengontrol **kolom** atau pencetakan bintang individual di dalam satu baris.
    * [cite_start]**Mengapa `j` di-reset?** `j` harus di-reset ke 0 (`int j=0;` [cite: 394]) di setiap awal *outer loop* agar pencetakan bintang di setiap baris baru **selalu dimulai dari kolom pertama** (hitungan ke-0).
    * **Jika tidak di-reset:** Nilai `j` akan terus bertambah dari iterasi baris sebelumnya. Setelah baris pertama (`i=1`) mencetak satu bintang (`j` menjadi 1), baris kedua (`i=2`) akan memulai dengan `j=1`. Loop `while(j<i)` (`1<2`) hanya berjalan sekali. Baris ketiga (`i=3`) memulai dengan `j=2`, loop `while(j<i)` (`2<3`) hanya berjalan sekali. Outputnya akan salah (kemungkinan besar hanya satu bintang per baris setelah baris pertama).

---

## 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

### 2.4.3 Pertanyaan

**1. [cite_start]Jelaskan apa yang terjadi pada variabel `totalNilai` di setiap iterasi outer loop dan mengapa inisialisasinya (`totalNilai=0`) berada di dalam outer loop, bukan di luar.** [cite: 498]

* **Jawaban:**
    * [cite_start]**Apa yang terjadi:** `totalNilai` berfungsi sebagai **akumulator** untuk menjumlahkan 5 nilai penilai [cite: 464] *di dalam* inner loop.
    * [cite_start]**Mengapa di dalam:** Inisialisasi `totalNilai = 0;` [cite: 472] ditempatkan **di dalam outer loop** (tapi *sebelum* inner loop) agar **hitungan total nilai di-reset kembali ke 0** setiap kali program berpindah ke kelompok berikutnya (iterasi outer loop berikutnya).
    * Jika `totalNilai = 0;` diletakkan *di luar* outer loop, maka total nilai Kelompok 2 akan ditambahkan ke total nilai Kelompok 1, total Kelompok 3 ditambahkan ke total Kelompok 2, dan seterusnya. Ini akan menghasilkan perhitungan rata-rata yang salah untuk semua kelompok kecuali kelompok pertama.

**2. [cite_start]Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut.** [cite: 499]

* **Jawaban:**
    * Modifikasi dilakukan dengan menambahkan dua variabel baru sebelum *outer loop* (misal: `float rataTertinggi = 0;` dan `int kelompokTertinggi = 0;`).
    * [cite_start]Kemudian, di dalam *outer loop* (setelah `rataNilai` dihitung [cite: 478]), tambahkan kondisi `if` untuk membandingkan `rataNilai` dengan `rataTertinggi`.
    * Terakhir, tampilkan `kelompokTertinggi` dan `rataTertinggi` setelah *outer loop* selesai.

    ```java
    import java.util.Scanner;

    public class NilaiKelompokNoAbsenModif {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int nilai;
            float totalNilai = 0, rataNilai;

            // --- TAMBAHAN MODIFIKASI ---
            float rataTertinggi = 0; // Menyimpan nilai rata-rata tertinggi
            int kelompokTertinggi = 0; // Menyimpan nomor kelompok tertinggi
            // ---------------------------

            int i = 1;
            while (i <= 6) { // Outer loop untuk 6 kelompok
                System.out.println("Kelompok " + i);
                totalNilai = 0; // Reset total per kelompok

                for (int j = 1; j <= 5; j++) { // Inner loop untuk 5 penilai
                    System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                    nilai = sc.nextInt();
                    totalNilai += nilai;
                }

                rataNilai = totalNilai / 5; // Hitung rata-rata
                System.out.println("Kelompok " + i + ": nilai rata-rata " + rataNilai);
                System.out.println();

                // --- TAMBAHAN MODIFIKASI ---
                // Cek apakah rata-rata kelompok ini lebih tinggi dari tertinggi sebelumnya
                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai; // Update nilai tertinggi
                    kelompokTertinggi = i; // Update nomor kelompok
                }
                // ---------------------------

                i++;
            }

            // --- TAMBAHAN MODIFIKASI ---
            // Tampilkan hasil di luar loop
            System.out.println("==============================================");
            System.out.println("Kelompok dengan rata-rata tertinggi adalah: Kelompok " + kelompokTertinggi);
            System.out.println("Dengan nilai rata-rata: " + rataTertinggi);
            // ---------------------------
        }
    }
    ```