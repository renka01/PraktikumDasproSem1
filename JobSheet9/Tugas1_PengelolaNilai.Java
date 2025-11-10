import java.util.Scanner;

public class Tugas1_PengelolaNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        if (jumlahNilai <= 0) {
            System.out.println("Jumlah nilai harus lebih dari 0.");
            return;
        }

        int[] nilai = new int[jumlahNilai];
        double total = 0;
        int nilaiTertinggi = Integer.MIN_VALUE; // Mulai dari nilai terkecil
        int nilaiTerendah = Integer.MAX_VALUE; // Mulai dari nilai terbesar

        // Input nilai, hitung total, cari tertinggi/terendah
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        double rataRata = total / jumlahNilai;

        System.out.println("\n--- Hasil Perhitungan Nilai Mahasiswa ---");
        System.out.println("Nilai Rata-rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah  : " + nilaiTerendah);

        System.out.println("\n--- Daftar Semua Nilai ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }
    }
}