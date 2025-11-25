public class PengunjungKafe15 {
    
    // Menggunakan varargs
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        // Modifikasi menggunakan for-each loop
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        
        System.out.println("------------------------");
        
        // Percobaan pemanggilan dengan jumlah argumen berbeda
        daftarPengunjung("Andi");
        
        System.out.println("------------------------");
        
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}