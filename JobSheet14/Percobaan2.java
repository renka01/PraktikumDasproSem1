import java.util.Scanner;

public class Percobaan2 {

  /*   static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    } */

        //modifikasi
   static int hitungPangkat(int x, int y) {
    if (y == 0) {
        System.out.print("1 = "); // Mencetak ujung deret saat base case
        return 1;
    } else {
        System.out.print(x + "x"); // Mencetak angka x dan tanda kali
        return (x * hitungPangkat(x, y - 1));
    }
}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
        }
    }
}