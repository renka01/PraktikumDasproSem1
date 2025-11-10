import java.util.Scanner;

public class Tugas3_CariMenuKafe {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

        // Menu yang telah ditentukan [cite: 263-264]
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        boolean makananDitemukan = false;

        System.out.println("--- Selamat Datang di Kafe ---");
        System.out.println("Menu yang tersedia:");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        // Proses: Linear Search [cite: 267]
        for (String item : menu) {
            // equalsIgnoreCase agar pencarian tidak case-sensitive
            if (makananDicari.equalsIgnoreCase(item)) {
                makananDitemukan = true;
                break;
            }
        }

        // Output hasil pencarian [cite: 268-271]
        if (makananDitemukan) {
            System.out.println("'" + makananDicari + "' tersedia di menu. Silakan memesan.");
        } else {
            System.out.println("Maaf, '" + makananDicari + "' tidak ada di menu kami.");
        }
     }
    }
}