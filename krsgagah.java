import java.util.Scanner;

public class krsgagah {

    public static void main(String[] args) {
        String pilihMEnu;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println(
                    "=== Sistem Pemantauan KRS Mahasiswa ===\n1. Tambah Data KRS\nTampilkan Daftar KRS Mahasiswa\n3. Analisis Data KRS\n4. Keluar");
            System.out.print("Pilih Menu :");
            pilihMEnu = sc.next();
            if (pilihMEnu.equalsIgnoreCase("1") || pilihMEnu.equalsIgnoreCase("Tambah Data KRS")) {
                System.out.println("aa");
            } else if (pilihMEnu.equalsIgnoreCase("4") || pilihMEnu.equalsIgnoreCase("Keluar")) {
                System.out.println("Terima Kasih");
                break;
            }

        }
    }
}