import java.util.Scanner;

public class Tugas3_KopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPelangganKeseluruhan = 0;
        int totalItemKeseluruhan = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        System.out.println();

        // Outer loop (Per Cabang)
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("== Input Penjualan Per Cabang ==");
            System.out.println("Cabang " + i);
            
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            
            int totalItemCabang = 0; // Reset accumulator untuk cabang ini

            // Inner loop (Per Pelanggan)
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem; // Akumulasi item per cabang
            }
            
            // Laporan per Cabang
            System.out.println("\n--- Laporan Cabang " + i + " ---");
            System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("Item terjual: " + totalItemCabang);
            System.out.println("---------------------\n");

            // Akumulasi total keseluruhan
            totalPelangganKeseluruhan += jumlahPelanggan;
            totalItemKeseluruhan += totalItemCabang;
        }

        // Laporan Total Keseluruhan
        System.out.println("== Total seluruh Cabang ==");
        System.out.println("Total Pelanggan: " + totalPelangganKeseluruhan + " orang");
        System.out.println("Total Item terjual: " + totalItemKeseluruhan + " item");
    }
}