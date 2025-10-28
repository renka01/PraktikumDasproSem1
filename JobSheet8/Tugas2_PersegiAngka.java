import java.util.Scanner;

public class Tugas2_PersegiAngka {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n (minimal 3) = ");
            int n = sc.nextInt();

            if (n < 3) {
                System.out.println("Error: Nilai n minimal 3.");
            } else {
                // Outer loop (Baris)
                for (int i = 1; i <= n; i++) {
                    // Inner loop (Kolom)
                    for (int j = 1; j <= n; j++) {
                        
                        // Kondisi untuk mencetak angka (Tepi)
                        if (i == 1 || i == n || j == 1 || j == n) {
                            System.out.print(n);
                        } else { // Kondisi untuk mencetak spasi (Tengah)
                            System.out.print(" ");
                        }
                    }
                    // Pindah baris
                    System.out.println();
                }
            }
        }
    }
}