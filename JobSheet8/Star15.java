import java.util.Scanner;
public class Star15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n = ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
                
            }
        }
    }

    
}
