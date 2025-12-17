import java.util.Scanner;

public class TugasRekursif {

    // fungsi rekursif untuk menjumlahkan elemen array
    // n ntuh jumlah elemen yang tersisa untuk dijumlahkan (index berjalan)
    static int hitungTotalRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0; // base case nya tod: jika tidak ada angka tersisa
        } else {
            // penjumlahan elemen ke n-1 sama hasil rekursif dari sisa elemen
            return angka[n - 1] + hitungTotalRekursif(angka, n - 1);
        }
    }

    // fungsi iteratif untuk menjumlahkan elemen array nya cik loh ya!
    static int hitungTotalIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total + angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        // Input jumlah angka (N)
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] dataAngka = new int[n];

        // Loop untuk input angka satu per satu (mundur kea di soal)
        //  spti di contoh soal: Input ke 4, 3 dan seterusnya
        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            dataAngka[i - 1] = sc.nextInt();
        }

        // outpout Hasil
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " 
                           + hitungTotalRekursif(dataAngka, n));
        }
    }
}