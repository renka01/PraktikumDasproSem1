import java.util.Scanner;

public class Tugas2_PemesananKafe {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        try (Scanner scString = new Scanner(System.in)){ // Scanner khusus untuk String

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();

        // Dua array terpisah untuk nama dan harga [cite: 252]
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = scString.nextLine();
            System.out.print("Harga: ");
            hargaPesanan[i] = sc.nextDouble();
            totalBiaya += hargaPesanan[i]; // Menghitung total [cite: 253]
        }

        System.out.println("\n--- Daftar Pesanan Anda ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + "\t- Rp " + hargaPesanan[i]);
        }

        System.out.println("---------------------------");
        System.out.println("Total Biaya: \t\t- Rp " + totalBiaya);
     }
    }
 }
}