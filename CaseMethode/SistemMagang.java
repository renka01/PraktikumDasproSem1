import java.util.Scanner;

public class SistemMagang {
   
    static String[][] dataPendaftar = new String[100][6]; 
    static int jumlahData = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        
        do {
            System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine(); // konsumsi newline

            switch (menu) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariData();
                    break;
                case 4:
                    hitungStatus();
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        } while (menu != 5);
    }

    // fitur fungsi 1: Menambahkan data dengan validasi
    static void tambahData() {
        System.out.println("\n--- Input Data Magang ---");
        
        System.out.print("Nama Mahasiswa: ");
        dataPendaftar[jumlahData][0] = sc.nextLine();
        
        System.out.print("NIM: ");
        dataPendaftar[jumlahData][1] = sc.nextLine();
        
        System.out.print("Program Studi: ");
        dataPendaftar[jumlahData][2] = sc.nextLine();
        
        System.out.print("Perusahaan Tujuan Magang: ");
        dataPendaftar[jumlahData][3] = sc.nextLine();

        // input validasi Semester (Hanya boleh 6 atau 7) 
        String semester;
        while (true) {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            semester = sc.nextLine();
            if (semester.equals("6") || semester.equals("7")) {
                break;
            } else {
                System.out.println("Input salah! Semester hanya boleh 6 atau 7.");
            }
        }
        dataPendaftar[jumlahData][4] = semester;

        //input Validasi Status (Diterima, Menunggu, Ditolak) 
        String status;
        while (true) {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            status = sc.nextLine();
            if (status.equalsIgnoreCase("Diterima") || 
                status.equalsIgnoreCase("Menunggu") || 
                status.equalsIgnoreCase("Ditolak")) {
                //text agar rapi
                status = status.substring(0, 1).toUpperCase() + status.substring(1).toLowerCase();
                break;
            } else {
                System.out.println("Input salah! Status hanya: Diterima, Menunggu, atau Ditolak.");
            }
        }
        dataPendaftar[jumlahData][5] = status;

        jumlahData++;
        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahData);
    }

    // fitur fungsi 2: Menampilkan seluruh data tabel
    static void tampilkanData() {
        System.out.println("\n--- Data Pendaftar Magang ---");
        if (jumlahData == 0) {
            System.out.println("Belum ada pendaftar.");
        } else {
            System.out.printf("%-3s %-15s %-10s %-20s %-15s %-5s %-10s\n", 
                "No", "Nama", "NIM", "Prodi", "Perusahaan", "Sem", "Status");
            System.out.println("-------------------------------------------------------------------------------------");
            for (int i = 0; i < jumlahData; i++) {
                System.out.printf("%-3d %-15s %-10s %-20s %-15s %-5s %-10s\n", 
                    (i + 1), 
                    dataPendaftar[i][0], // Nama
                    dataPendaftar[i][1], // NIM
                    dataPendaftar[i][2], // Prodi
                    dataPendaftar[i][3], // Perusahaan
                    dataPendaftar[i][4], // Semester
                    dataPendaftar[i][5]);// Status
            }
        }
    }

    // fitur fungsi 3: Mencari data berdasarkan Program Studi
    static void cariData() {
        System.out.println("\n--- Cari Pendaftar ---");
        System.out.print("Masukkan Program Studi: ");
        String cariProdi = sc.nextLine();
        boolean ditemukan = false;

        System.out.printf("%-3s %-15s %-10s %-20s %-15s %-5s %-10s\n", 
                "No", "Nama", "NIM", "Prodi", "Perusahaan", "Sem", "Status");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahData; i++) {
            
            if (dataPendaftar[i][2].equalsIgnoreCase(cariProdi)) {
                System.out.printf("%-3d %-15s %-10s %-20s %-15s %-5s %-10s\n", 
                    (i + 1), 
                    dataPendaftar[i][0],
                    dataPendaftar[i][1],
                    dataPendaftar[i][2],
                    dataPendaftar[i][3], 
                    dataPendaftar[i][4],
                    dataPendaftar[i][5]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan program studi '" + cariProdi + "' tidak ditemukan.");
        }
    }

    // fitur fungsi 4: menghitung jumlah pendaftar per status
    static void hitungStatus() {
        System.out.println("\n--- Rekap Status Magang ---");
        int countDiterima = 0;
        int countMenunggu = 0;
        int countDitolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            String status = dataPendaftar[i][5];
            if (status.equalsIgnoreCase("Diterima")) {
                countDiterima++;
            } else if (status.equalsIgnoreCase("Menunggu")) {
                countMenunggu++;
            } else if (status.equalsIgnoreCase("Ditolak")) {
                countDitolak++;
            }
        }

        System.out.println("Diterima : " + countDiterima);
        System.out.println("Menunggu : " + countMenunggu);
        System.out.println("Ditolak  : " + countDitolak);
        System.out.println("Total pendaftar: " + jumlahData);
    }
}
    
    
