import java.util.Scanner; // [cite: 167]

public class NilaiKelompok15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Deklarasi variabel
            int nilai;
            float totalNilai = 0, rataNilai; // [cite: 149]

            int i = 1; // [cite: 190]
            // Outer loop (untuk 6 kelompok)
            while (i <= 6) { // [cite: 191]
                System.out.println("Kelompok " + i); // [cite: 192]

                totalNilai = 0; //  // Reset total nilai untuk setiap kelompok

                // Inner loop (untuk 5 penilai)
                for (int j = 1; j <= 5; j++) { // [cite: 194]
                    System.out.print("  Nilai dari Kelompok Penilai " + j + ": "); // [cite: 195]
                    nilai = sc.nextInt(); // [cite: 195]
                    totalNilai += nilai; // 
                }

                // Hitung rata-rata
                rataNilai = totalNilai / 5; // [cite: 199]
                System.out.println("Kelompok " + i + ": nilai rata-rata " + rataNilai); // [cite: 211-216]
                System.out.println(); // Spasi

                i++; // [cite: 200]
            }
        }
    }
}