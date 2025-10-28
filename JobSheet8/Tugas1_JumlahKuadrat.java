import java.util.Scanner;

public class Tugas1_JumlahKuadrat {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n = ");
            int n = sc.nextInt();

            // Outer loop: berjalan dari 1 sampai n
            for (int i = 1; i <= n; i++) {
                int totalKuadrat = 0;
                String hitungan = "";

                // Inner loop: menghitung 1^2 + ... + i^2
                for (int j = 1; j <= i; j++) {
                    totalKuadrat += (j * j);
                    
                    hitungan += (j * j);
                    if (j < i) {
                        hitungan += " + ";
                    }
                }
                
                // Menampilkan output sesuai format
                System.out.println("n=" + i + " -> jumlah kuadrat = " + hitungan + " = " + totalKuadrat);
            }
        }
    }
}