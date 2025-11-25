import java.util.Scanner;

public class Tugas3RekapPenjualanKafe15 {
    static Scanner sc = new Scanner(System.in);
    
    // a. Fungsi Input Data (Array 2D: [Menu][Hari])
    public static void inputDataPenjualan(int[][] data, String[] menu, int jumlahHari) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // b. Fungsi Menampilkan Tabel
    public static void tampilkanData(int[][] data, String[] menu, int jumlahHari) {
        System.out.println("\n=== Rekap Penjualan ===");
        System.out.print("Menu\t\t");
        for (int j = 0; j < jumlahHari; j++) {
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + (menu[i].length() < 8 ? "\t\t" : "\t")); // Formatting tab
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // c. Fungsi Menu Penjualan Tertinggi
    public static void menuTertinggi(int[][] data, String[] menu, int jumlahHari) {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += data[i][j];
            }
            
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris);
        System.out.println("Total terjual: " + maxPenjualan);
    }

    // d. Fungsi Rata-rata Penjualan
    public static void rataRataPenjualan(int[][] data, String[] menu, int jumlahHari) {
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += data[i][j];
            }
            double avg = (double) total / jumlahHari;
            System.out.printf("%s: %.2f\n", menu[i], avg);
        }
    }

    public static void main(String[] args) {
        // Soal 3b: Input jumlah menu dan hari dinamis
        System.out.print("Masukkan jumlah jenis menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jmlHari = sc.nextInt();
        sc.nextLine(); // Konsumsi newline

        String[] menu = new String[jmlMenu];
        // Input nama menu
        for(int i=0; i<jmlMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }

        int[][] dataPenjualan = new int[jmlMenu][jmlHari];

        // 1. Panggil fungsi input
        inputDataPenjualan(dataPenjualan, menu, jmlHari);

        // 2. Panggil fungsi tampil
        tampilkanData(dataPenjualan, menu, jmlHari);

        // 3. Panggil fungsi tertinggi
        menuTertinggi(dataPenjualan, menu, jmlHari);

        // 4. Panggil fungsi rata-rata
        rataRataPenjualan(dataPenjualan, menu, jmlHari);
    }
}