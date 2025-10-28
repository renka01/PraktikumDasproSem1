import java.text.DecimalFormat;
import java.util.Scanner;

public class penilaianAkademik {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.00"); // Untuk format dua angka desimal
            
            // --- TAHAP 1: INPUT DATA ---
            System.out.println("=====INPUT DATA MAHASISWA=====");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("NIM : ");
            String nim = input.nextLine();
            
            System.out.println("\n-----Mata Kuliah 1: Algoritma dan Pemrograman-----");
            System.out.print("Nilai UTS  : ");
            double utsAlgo = input.nextDouble();
            System.out.print("Nilai UAS  : ");
            double uasAlgo = input.nextDouble();
            System.out.print("Nilai Tugas: ");
            double tugasAlgo = input.nextDouble();
            
            System.out.println("\n-----Mata Kuliah 2: Struktur Data-----");
            System.out.print("Nilai UTS  : ");
            double utsStrukdat = input.nextDouble();
            System.out.print("Nilai UAS  : ");
            double uasStrukdat = input.nextDouble();
            System.out.print("Nilai Tugas: ");
            double tugasStrukdat = input.nextDouble();
            
            // --- TAHAP 2: PROSES PERHITUNGAN ---
            
            // 2a. Hitung Nilai Akhir untuk setiap mata kuliah
            double nilaiAkhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
            double nilaiAkhirStrukdat = (utsStrukdat * 0.3) + (uasStrukdat * 0.4) + (tugasStrukdat * 0.3);
            
            // 2b. Tentukan Nilai Huruf dan Status Lulus untuk setiap mata kuliah
            String nilaiHurufAlgo = konversiNilaiKeHuruf(nilaiAkhirAlgo);
            String nilaiHurufStrukdat = konversiNilaiKeHuruf(nilaiAkhirStrukdat);
            
            String statusAlgo = (nilaiAkhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";
            String statusStrukdat = (nilaiAkhirStrukdat >= 60) ? "LULUS" : "TIDAK LULUS";
            
            // --- TAHAP 3: TENTUKAN STATUS KELULUSAN SEMESTER (LOGIKA NESTED IF) ---
            double rataRata = (nilaiAkhirAlgo + nilaiAkhirStrukdat) / 2;
            String statusSemester = "";
            String alasanTidakLulus = "";
            
            // Pengecekan Tingkat Pertama: Apakah kedua mata kuliah LULUS?
            if (statusAlgo.equals("LULUS") && statusStrukdat.equals("LULUS")) {
                // Pengecekan Tingkat Kedua (Nested): Cek rata-rata nilai akhir
                if (rataRata >= 70) {
                    statusSemester = "LULUS";
                } else {
                    statusSemester = "TIDAK LULUS";
                    alasanTidakLulus = " (Rata-rata < 70)";
                }
            } else {
                // Jika salah satu atau keduanya tidak lulus
                statusSemester = "TIDAK LULUS";
                alasanTidakLulus = " (Terdapat mata kuliah yang tidak lulus)";
            }
            
            // --- TAHAP 4: TAMPILKAN OUTPUT ---
            System.out.println("\n======================================");
            System.out.println("HASIL PENILAIAN AKADEMIK");
            System.out.println("======================================");
            System.out.println("Nama\t: " + nama);
            System.out.println("NIM \t: " + nim);
            System.out.println();
            
            System.out.printf("%-25s %-10s %-10s %-10s %-15s %-15s %-10s\n", "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.printf("%-25s %-10.2f %-10.2f %-10.2f %-15s %-15s %-10s\n", "Algoritma Pemrograman", utsAlgo, uasAlgo, tugasAlgo, df.format(nilaiAkhirAlgo), nilaiHurufAlgo, statusAlgo);
            System.out.printf("%-25s %-10.2f %-10.2f %-10.2f %-15s %-15s %-10s\n", "Struktur Data", utsStrukdat, uasStrukdat, tugasStrukdat, df.format(nilaiAkhirStrukdat), nilaiHurufStrukdat, statusStrukdat);
            System.out.println("---------------------------------------------------------------------------------------------------------");
            
            System.out.println("\nRata-rata Nilai Akhir: " + df.format(rataRata));
            System.out.println("Status Semester \t: " + statusSemester + alasanTidakLulus);
        } // Untuk format dua angka desimal
    }

    // Fungsi bantuan untuk mengonversi nilai angka ke huruf sesuai tabel
    public static String konversiNilaiKeHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) return "A";
        if (nilai > 73 && nilai <= 80) return "B+";
        if (nilai > 65 && nilai <= 73) return "B";
        if (nilai > 60 && nilai <= 65) return "C+";
        if (nilai > 50 && nilai <= 60) return "C";
        if (nilai > 39 && nilai <= 50) return "D";
        return "E";
    }
}