import java.util.Scanner;

public class Tugas1Kubus15 {
    
    // Fungsi menghitung Volume Kubus (sisi * sisi * sisi)
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    
    // Fungsi menghitung Luas Permukaan Kubus (6 * sisi * sisi)
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
        System.out.print("Masukkan panjang sisi kubus: ");
        int s = sc.nextInt();
        
        int vol = hitungVolume(s);
        int lp = hitungLuasPermukaan(s);
        
        System.out.println("Volume Kubus: " + vol);
        System.out.println("Luas Permukaan Kubus: " + lp);
        
        }
    }
}