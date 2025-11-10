import java.util.Scanner;

public class SearchNilai15 {
    public static void main(String[] args) {
        // 1. Tambahkan Scanner untuk menerima input
        try (Scanner sc = new Scanner(System.in)) {

        
        
        // 2. Minta input untuk banyaknya elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        
        // 3. Inisialisasi array berdasarkan input pengguna
        int[] arrNilai = new int[jumlahNilai];

        // 4. Buat perulangan untuk mengisi array
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // 5. Minta input untuk nilai (key) yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // 6. Inisialisasi 'hasil' dengan -1 (penanda jika tidak ditemukan)
        // Ini lebih baik daripada '0', karena '0' adalah indeks yang valid
        int hasil = -1;

        // 7. Loop pencarian (sama seperti kode asli)
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // Simpan indeks jika ditemukan
                break;
            }
        }
        
        System.out.println(); // Memberi spasi

        // 8. Ubah output agar sesuai dengan contoh di gambar
        if (hasil != -1) {
            // (hasil + 1) digunakan agar sesuai contoh (indeks 4 = mahasiswa ke-5)
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            // Ini untuk menjawab Pertanyaan 3 (jika nilai tidak ditemukan)
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
        System.out.println();
    }
  }
}