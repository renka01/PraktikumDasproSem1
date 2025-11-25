import java.util.Scanner;

public class SistemPemantauanKonsumsiAirBersihAntarWilayah {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        // Jumlah hari di-set fix 7 (Senin-Minggu)
        final int HARI_COUNT = 7;
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.print("Masukkan jumlah wilayah: ");
        int wilayahCount = sc.nextInt();
        
        // Deklarasi array 2 dimensi dengan jumlah kolom fix 7
        double[][] konsumsiAir = new double[wilayahCount][HARI_COUNT];

        // BAGIAN 1: INPUT DATA
        System.out.println("\n===== INPUT DATA KONSUMSI AIR BERSIH (Liter) =====");
        for (int i = 0; i < wilayahCount; i++) {
            System.out.println("Masukkan data untuk Wilayah " + (i + 1) + ":");
            for (int j = 0; j < HARI_COUNT; j++) {
                // Menggunakan nama hari dalam input
                System.out.printf("  Konsumsi %s (Liter): ", namaHari[j]); 
                konsumsiAir[i][j] = sc.nextDouble();
            }
        }

        // BAGIAN 2: PEMROSESAN DATA
        double maxTotalKonsumsi = -1;
        int wilayahTertinggiIndex = -1;
        
        // Array untuk menyimpan Total Konsumsi per Wilayah
        double[] totalKonsumsiPerWilayah = new double[wilayahCount];
        
        // Loop untuk menghitung total dan mencari wilayah tertinggi
        for (int i = 0; i < wilayahCount; i++) {
            double totalKonsumsi = 0;
            for (int j = 0; j < HARI_COUNT; j++) {
                totalKonsumsi += konsumsiAir[i][j];
            }
            totalKonsumsiPerWilayah[i] = totalKonsumsi;
            
            if (totalKonsumsi > maxTotalKonsumsi) {
                maxTotalKonsumsi = totalKonsumsi;
                wilayahTertinggiIndex = i;
            }
        }  

        // BAGIAN 3: OUTPUT TABEL HASIL
        System.out.println("\n===== LAPORAN KONSUMSI AIR BERSIH PER WILAYAH (Liter) =====");
        
        // 1. kepala Tabel
        System.out.printf("| %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-13s |%n", 
            "Wilayah", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu", "TOTAL (L)"
        );
        System.out.println("+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+---------------+");

        // 2. isi Tabel Data Konsumsi
        for (int i = 0; i < wilayahCount; i++) {
            System.out.printf("| %-9s ", "Wilayah " + (i + 1));
            for (int j = 0; j < HARI_COUNT; j++) {
                
                System.out.printf("| %-9.1f ", konsumsiAir[i][j]); 
            }
            // Menampilkan Total Konsumsi
            System.out.printf("| %-13.1f |%n", totalKonsumsiPerWilayah[i]);
        }
        System.out.println("+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+---------------+");

        // 3. Rekap Data Konsumsi Tertinggi Harian
        System.out.println("\n===== KONSUMSI TERTINGGI HARIAN =====");
        for (int i = 0; i < wilayahCount; i++) {
            double maxKonsumsiHarian = konsumsiAir[i][0];
            String hariTertinggiHarian = namaHari[0];
            
            for (int j = 1; j < HARI_COUNT; j++) {
                if (konsumsiAir[i][j] > maxKonsumsiHarian) {
                    maxKonsumsiHarian = konsumsiAir[i][j];
                    hariTertinggiHarian = namaHari[j];
                }
            }
            
            System.out.printf("Wilayah %d: Hari tertinggi adalah **%s** dengan konsumsi %.1f Liter.%n",
                (i + 1), hariTertinggiHarian, maxKonsumsiHarian);
        }

        // 4. Kesimpulan Akhir
        System.out.println("\n=======================================================");
        if (wilayahTertinggiIndex != -1) {
            System.out.printf(" **KESIMPULAN**: Wilayah dengan TOTAL KONSUMSI SEMINGGU Tertinggi adalah **Wilayah %d** dengan total %.1f Liter.%n",
                (wilayahTertinggiIndex + 1), maxTotalKonsumsi);
        }
        sc.close();
    }
}

}