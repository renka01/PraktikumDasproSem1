import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int hargaTiket = 50000, jmlTiket, jmlpengunjung, i = 1;
            double totalHarga, totalPenjualan = 0;
            System.out.println("=====MENGHITUNG TOTAL PENJUALAN=====");
            System.out.print("Jumlah Pengunjung Hari Ini    : ");
            jmlpengunjung = sc.nextInt();
            System.out.println();
            System.out.println("==========DATA PENGUNJUNG==========");
            while (i <= jmlpengunjung) {
                System.out.println("Transaksi Pelanggan Ke-" + i);
                System.out.print("Jumlah Tiket      : ");
                jmlTiket = sc.nextInt();
                
                if (jmlTiket < 1) {
                    System.out.println("Jumlah Tiket Tidak Valid");
                    continue;
                }
                
                if (jmlTiket > 10) {
                    totalHarga = (0.15*hargaTiket) * jmlTiket;
                    System.out.println("Total Harga Tiket : " + totalHarga);
                } else if (jmlTiket > 4) {
                    totalHarga = (0.9*hargaTiket) * jmlTiket;
                    System.out.println("Total Harga Tiket : " + totalHarga);
                } else {
                    totalHarga = hargaTiket * jmlTiket;
                    System.out.println("Total Harga Tiket : " + totalHarga);
                }
                
                System.out.println();
                i++;
                totalPenjualan += totalHarga;
            }   System.out.println("==========TOTAL PENJUALAN==========");
            System.out.println("Total Penjualan Hari Ini Sebanyak : Rp "+totalPenjualan);
            System.out.println("Jumlah Pengunjung Hari Ini        : " +jmlpengunjung);
        }
    }
}