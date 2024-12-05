import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tambahKrs(sc);
                    break;
                case 2:
                    tampilDaftar(sc);
                    break;
                case 3:
                    analisisJumlah(sc);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silahkan input ulang.");
                    continue;
            }

        } while (pilihan != 4);
    }

    static void tambahKrs(Scanner sc) {
        
    }

    static void tampilDaftar(Scanner sc) {
        
    }

    static void analisisJumlah(Scanner sc) {
        
    }
}
