import java.util.Scanner;
public class SIAKAD15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        int[][] nilai =  new int[3][4];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            } 
            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
        }

        System.out.println("\n ========================= \n");
        System.out.println("Rata rata nilai setiap mata Kuliah: ");

        for (int j = 0; j < nilai[0].length; j++){
            double totalPerMatkul = 0;

            for (int k = 0; k < nilai.length; k++){
                totalPerMatkul += nilai[k][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
            }
        
        }
    
    }
}