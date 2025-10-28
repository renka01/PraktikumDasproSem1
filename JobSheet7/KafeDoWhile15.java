import java.util.Scanner;
public class KafeDoWhile15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int kopi, teh, roti, totalHarga;
            String namaPelanggan;
            int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
            do {
                System.out.println("masukkan nama pelanggan (ketik 'batal' untuk keluar: )");
                namaPelanggan = sc.nextLine();
                if (namaPelanggan.equalsIgnoreCase("batal")) {
                    System.out.println("transaksi Dibatalkan.");
                    break;
                }
                System.out.println("Jumlah Kopi: ");
                kopi = sc.nextInt();
                System.out.println("Jumlah Teh: ");
                teh = sc.nextInt();
                System.out.println("Jumlah Roti: ");
                roti = sc.nextInt();
                
                totalHarga = (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
                System.out.println("Total yang harus dibayar: Rp "+totalHarga);
                sc.nextLine();
            } while (true);
        }
    }
}