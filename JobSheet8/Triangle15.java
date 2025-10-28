import java.util.Scanner; // [cite: 108]

public class Triangle15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n = "); // [cite: 111]
            int n = sc.nextInt(); // [cite: 112]
            
            int i = 0; // [cite: 113]
            while (i < n) { // PERBAIKAN 1 (Kondisi diubah dari <=n menjadi <n)
                int j = 0; // 
                while (j <= i) { // PERBAIKAN 2 (Kondisi diubah dari <i menjadi <=i)
                    System.out.print("*"); // [cite: 117]
                    j++; // [cite: 118]
                }
                System.out.println(); // PERBAIKAN 3 (Menambahkan println)
                i++; // [cite: 120]
            }
        }
    }
} 
    

