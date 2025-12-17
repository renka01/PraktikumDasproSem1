## Jawaban Pertanyaan & Tugas - Jobsheet 14 (Fungsi Rekursif)
**.1 Percobaan 1 (Faktorial)**
1. Apa yang dimaksud dengan fungsi rekursif?

Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri di dalam badan fungsi tersebut untuk menyelesaikan masalah dengan memecahnya menjadi sub-masalah yang lebih kecil hingga mencapai kondisi berhenti (base case).


2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

Hasil: Ya, kedua fungsi menghasilkan nilai output yang sama .

Perbedaan Alur:

Fungsi Rekursif: Menggunakan mekanisme stack (tumpukan) memori. Fungsi akan terus memanggil dirinya sendiri (n memanggil n-1) hingga mencapai base case (n==0). Setelah itu, nilai dikembalikan (return) secara berantai dari panggilan terakhir kembali ke panggilan pertama .

Fungsi Iteratif: Menggunakan struktur perulangan biasa (for). Perhitungan dilakukan dalam satu blok memori dengan mengupdate nilai variabel faktor secara berulang dari n hingga 1 tanpa melakukan pemanggilan fungsi bertingkat .

# 2.2 Percobaan 2 (Pangkat)
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat (bilangan, pangkat). Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Proses pemanggilan fungsi akan terus berjalan selama nilai pangkat (y) belum mencapai 0. Proses ini akan berhenti ketika parameter y bernilai 0, di mana fungsi akan mengeksekusi blok if (y == 0) dan mengembalikan nilai 1 sebagai base case .


2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya!
modifikasi kode pada fungsi hitungPangkat agar mencetak deret perkalian (contoh output: 2x2x2x2x2x1 = 32):

  static int hitungPangkat(int x, int y) {
    if (y == 0) {
        System.out.print("1 = "); // Mencetak ujung deret saat base case
        return 1;
    } else {
        System.out.print(x + "x"); // Mencetak angka x dan tanda kali
        return (x * hitungPangkat(x, y - 1));
    }
} 

# 2.3 Percobaan 3 (Investasi Laba)
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan "base case" dan "recursion call"!

Base Case (Kondisi Berhenti):
if (tahun == 0) {
    return (saldo);
}
(Menghentikan rekursi saat tahun sudah habis)

Recursion Call (Pemanggilan Rekursif):
return (1.11 * hitungLaba(saldo, tahun - 1));
(Memanggil kembali fungsi dengan mengurangi durasi tahun)

2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000, 3)!

Tahap,Jenis Fase,Proses Logika
1. Ekspansi,"hitungLaba(100000, 3) → return 1.11×hitungLaba(100000,2)"
2. Ekspansi,"hitungLaba(100000, 2) → return 1.11×hitungLaba(100000,1)"
3. Ekspansi,"hitungLaba(100000, 1) → return 1.11×hitungLaba(100000,0)"
4. Base Case,"hitungLaba(100000, 0) → mengembalikan nilai 100000"
5. Substitusi, Kembali ke tahap 3 : 1.11×100000=111000
6. Substitusi, Kembali ke tahap 2 : 1.11×111000=123210
7. Substitusi, Kembali ke tahap 1 : 1.11×123210=136763.1