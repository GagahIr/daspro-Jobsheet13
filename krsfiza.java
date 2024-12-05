import java.util.Scanner;

public class krsfiza {
    static String[][] krs = new String[100][5];
    static int data = 0;
    
    public static void tambahData(Scanner sc) {
        String nama, nim, kodeMatkul, namaMatkul;
        int jumlahSks;

        System.out.println("--- Tambah Data KRS ---");
        System.out.print("nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        nim = sc.nextLine();

        for (int i = 0; i < krs.length; i++) {
            while (true) {
                System.out.print("Kode matkul: ");
                kodeMatkul = sc.nextLine();
                System.out.print("Nama matkul: ");
                namaMatkul = sc.nextLine();
                System.out.print("Jumlah SKS: ");
                jumlahSks = sc.nextInt();
                sc.nextLine();
                if (jumlahSks >= 1 && jumlahSks <= 3) {
                    System.out.println("Data berhasil ditambahkan");
                    break;
                } else {
                    System.out.println("Jumlah SKS tida valid! SKS harus anatara 1 dan 3");
                    continue;

                }
                
            }
            
            krs[data][0] = nim;
            krs[data][1] = nama;
            krs[data][2] = kodeMatkul;
            krs[data][3] = namaMatkul;
            krs[data][4] = Integer.toString(jumlahSks);
            data++;
            
            System.out.print("Masukkan matkul lainnya (y/t)? ");
            String pilih = sc.nextLine();
            
            if (pilih.equalsIgnoreCase("t")) {
                break;
            }
        }
        System.out.println("Total SKS yang diambil: " + hitungTotalSks(nim));
    }
    public static int hitungTotalSks(String nim){
        int totalSKS = 0;
        for (int i = 0; i < data; i++) {
            if (krs[i][0].equals(nim)) {
                totalSKS += Integer.parseInt(krs[i][4]);
            }
        }
        return totalSKS;
    }
    public static void tampilData(Scanner sc) {
        
        String nim;
        int totalSKS = 0;

        System.out.println("--- Tampilkan Daftar KRS Mahasiswa");
        System.out.print("Masukkan NIM Mahasiswa : ");
        // sc.nextLine();
        nim = sc.nextLine();
        // sc.nextLine();

        // boolean search = false;
        System.out.println("\ndata mata kuliah");
        System.out.printf("%-12s %-20s %-10s %-25s %-10s\n", "NIM", "Nama", "Kode MK", "Nama Mata Kuliah", "SKS");
        for (int i = 0; i < data; i++) {
            if (nim.equals(krs[i][0])) { 
                // search = true;
                totalSKS += Integer.parseInt(krs[i][4]);
                System.out.printf("%-12s %-20s %-10s %-25s %-10s\n", krs[i][0], krs[i][1], krs[i][2], krs[i][3], krs[i][4]);
            } 
        }
        
        System.out.println("Total SKS: " + hitungTotalSks(nim));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahData(sc);
                    break;
                case 2:
                    tampilData(sc);;
                    break;
                case 3:
                    // analisisJumlah(sc);
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

}