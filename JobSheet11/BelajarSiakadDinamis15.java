import java.util.Scanner;

public class BelajarSiakadDinamis15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
        // Modifikasi Pertanyaan 1: Input Dinamis
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlSiswa][jmlMatkul];

        // Input Nilai
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Menghitung Rata-rata per Siswa
        System.out.println("\n--- Rata-rata Nilai per Siswa ---");
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + (totalPerSiswa / jmlMatkul));
        }

        // Menghitung Rata-rata per Mata Kuliah
        System.out.println("\n--- Rata-rata Nilai per Mata Kuliah ---");
        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalPerMatkul / jmlSiswa));
        }

      }
    }
}