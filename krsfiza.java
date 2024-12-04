import java.util.Scanner;

public class krsfiza {
    static String[][] krs = new String[100][5];
    static int data = 0;

    public static void tambahData(Scanner sc) {
        String kodeMatkul, namaMatkul, jumlahSks;
        System.out.println("--- Tambah Data KRS ---");
        System.out.print("nama mahasiswa: ");
        sc.nextLine();
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        for (int i = 0; i < krs.length; i++) {

            while (true) {
                System.out.print("Kode matkul: ");
                kodeMatkul = sc.nextLine();
                System.out.print("Nama matkul: ");
                namaMatkul = sc.nextLine();
                System.out.print("Jumlah SKS: ");
                jumlahSks = sc.nextLine();
                if (!jumlahSks.equalsIgnoreCase("1") && !jumlahSks.equalsIgnoreCase("2")
                        && !jumlahSks.equalsIgnoreCase("3")) {
                    System.out.println("Jumlah SKS tida valid! SKS harus anatara 1 dan 3");
                    continue;
                } else {
                    System.out.println("Data berhasil ditambahkan");
                    break;
                }
            }

            krs[data][0] = nim;
            krs[data][1] = nama;
            krs[data][2] = kodeMatkul;
            krs[data][3] = namaMatkul;
            krs[data][4] = jumlahSks;
            data++;

            System.out.print("Masukkan matkul lainnya (y/t)? ");
            String pilih = sc.nextLine();

            if (pilih.equalsIgnoreCase("t")) {
                break;
            }
        }
    }

    public static void tampilData(Scanner sc) {
        String nim;
        System.out.println("--- Tampilkan Daftar KRS Mahasiswa");
        System.out.print("Masukkan NIM Mahasiswa : ");
        nim = sc.next();

        System.out.println("\ndata mata kuliah");
        System.out.printf("%s\t %s\t %s \t %s \t %s", "NIM", "Nama", "Kode Matkul", "Nama matkul", "Jumlah SKS");
        System.out.println();
        for (int i = 0; i < data; i++) {
            if (nim.equals(krs[i][0])) {                
                System.out.printf("%s \t %s\t %s\t\t %s \t %s", krs[i][0], krs[i][1], krs[i][2], krs[i][3], krs[i][4]);
                System.out.println();
            }
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