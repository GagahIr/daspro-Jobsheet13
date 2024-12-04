import java.util.Scanner;

public class krsfiza {
    static String[][] krs = new String[10][5];
    static String[] data = new String[2];

    public static void tambahData(Scanner sc) {
        System.out.println("--- Tambah Data KRS ---");
        System.out.print("nama mahasiswa: ");
        data[1] = sc.nextLine();
        sc.nextLine();
        System.out.print("NIM: ");
        data[0] = sc.nextLine();

        for (int i = 0; i < krs.length; i++) {
            System.out.print("Kode matkul: ");
            krs[i][0] = sc.nextLine();
            System.out.print("Nama matkul: ");
            krs[i][1] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            krs[i][2] = sc.nextLine();
            

            System.out.print("Masukkan matkul lainnya (y/t)? ");
            String pilih = sc.nextLine();

            if (pilih.equalsIgnoreCase("t")) {
                break;
            }
        }

    }

    public static void tampilData(Scanner sc) {

        System.out.println("\ndata mata kuliah");
        System.out.println("Nama mahasiswa:\t " + data[1]);
        System.out.println("NIM:\t " + data[0]);
        System.out.printf("%s \t %s \t %s", "Kode Matkul", "Nama matkul", "Jumlah SKS");
        for (int i = 0; i < krs.length; i++) {
            System.out.printf("%s \t %s \t %s", krs[i][0], krs[i][1], krs[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=================================");
            System.out.println("===== Sistem pemantauan KRS =====");
            System.out.println("=================================");
            System.out.println("1. Tambah data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis data KRS");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                tambahData(sc);
            } else if (menu == 2) {
                tampilData(sc);
            }
        }
    }
}