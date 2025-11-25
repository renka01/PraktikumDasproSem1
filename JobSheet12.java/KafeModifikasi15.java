import java.util.Scanner;

public class KafeModifikasi15 {
    // Percobaan 2: Fungsi Menu dengan Parameter
public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        // Soal Percobaan 2 No 6
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo Valid: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo Valid: Diskon 30%");
        } else {
            System.out.println("Kode Promo Invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    // Percobaan 3: Fungsi Hitung Total dengan Return Value & Kode Promo
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        // Menangani input menu yang salah
        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        // Soal Percobaan 3 No 3: Logika Diskon Kode Promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            hargaTotal = (int)(hargaTotal * 0.5);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            hargaTotal = (int)(hargaTotal * 0.7);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid, tidak ada potongan harga.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Apakah member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine(); // consume leftover newline from nextBoolean()
        System.out.print("Masukkan kode promo (kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine(); // gunakan nextLine() agar bisa kosongkan input

        // Panggil Menu
        Menu(nama, isMember, kodePromo);

        int totalKeseluruhan = 0;
        boolean lanjutPesan = true;

        // Soal Percobaan 3 No 4: Loop agar bisa pesan banyak menu
        while (lanjutPesan) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.print("Ingin memesan menu lain? (y/t): ");
            String konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("t")) {
                lanjutPesan = false;
            }
        }

        System.out.println("\nTotal harga keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
    }
  }
}