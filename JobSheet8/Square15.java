import java.util.Scanner; // [cite: 59]

public class Square15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai N = "); // [cite: 67]
            int N = sc.nextInt(); // [cite: 68]

            // Outer loop untuk baris
            for (int iOuter = 1; iOuter <= N; iOuter++) { // [cite: 75]
                // Inner loop untuk kolom
                for (int i = 1; i <= N; i++) { // [cite: 78]
                    System.out.print("*"); // [cite: 79]
                }
                System.out.println(); // 
            }
        }
    }
}