import java.util.Scanner;
public class ArrayBilangan15 {
    public static void main(String[] args){
        int[] nilaiMhs = mew int[10];
        double total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rataRata = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai : " + rataRata);
    }

}
