import java.util.Scanner;
public class SiakadFor15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double nilai, Tertinggi = 0, Terendah = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.println("masukkan Nilai Mahasiswa Ke-" + i + ": ");
                nilai = sc.nextDouble();
                if (nilai > Tertinggi) {
                    Tertinggi = nilai;
                }
                if (nilai < Terendah) {
                    Terendah = nilai;
                }
            }   System.out.println("Nilai Tertinggi: "+Tertinggi);
            System.out.println("Nilai Terendah: "+Terendah);
        }
    }
}