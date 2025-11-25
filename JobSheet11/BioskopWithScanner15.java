import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int baris, kolom, menu;
            String nama, next;
            

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("====MENU====");
            System.out.println("1. Input Penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. EXIT");
            System.out.print("Pilih menu: (1/2/3) ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.println(" Masukkan Nama: " );
                        nama = sc.nextLine();
                        System.out.println(" Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        sc.nextLine();
                        System.out.println(" Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {

                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println(" Data berhasil disimpan.");
                                break;
                            } else {
                                System.out.println(" Tempat sudah terisi. Silakan pilih tempat lain.");
                            }
                        } else {
                            System.out.println(" Baris tidak valid. Silakan coba lagi.");
                        }
                    }
           // System.out.print("Masukkan Nama: ");
           // nama = sc.nextLine();
           // System.out.print("Masukkan baris: ");
           //baris = sc.nextLine();
           // System.out.print("Masukkan kolom: ");
           // kolom = sc.nextLine();

           // penonton[barisInt - 1][kolomInt - 1] = nama;

            System.out.print("Input penonton lainnya (y/n)? ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        
    

    break;

    case 2:
        System.out.println("====DAFTAR PENONTON====");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                String namaPenonton = penonton[i][j];

                if(namaPenonton != null) {
                    System.out.printf("Baris %d, Kolom %d: %s%n", i + 1, j + 1, "***");
                } else {
                    System.out.printf("Baris %d, Kolom %d: [Kosong]%n", (i + 1), (j + 1), namaPenonton);
                }
            }
        }
        System.out.println("==========================");
        break;

        case 3:
        System.out.println("Terimakasih, Program keluar");
        System.exit(0);
        break;

        default:
        System.out.println("Menu tidak valid. Silahkan pilih 1, 2, atau 3.");

        }
    }
       }
}
}


