import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    String asalDaerah;

    Mahasiswa(String nim, String nama, String asalDaerah) {
        this.nim = nim;
        this.nama = nama;
        this.asalDaerah = asalDaerah;
    }
}

public class DataMahasiswa {
    private static final int MAX_MHSW = 10;
    private static Mahasiswa[] dataMahasiswa = new Mahasiswa[MAX_MHSW];
    private static int countMahasiswa = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=-= Data Mahasiswa =-=");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    if (countMahasiswa < MAX_MHSW) {
                        tambahData(scanner);
                    } else {
                        System.out.println("Mahasiswa kebanyakan.");
                    }
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariData(scanner);
                    break;
                case 4:
                    hapusData(scanner);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan hanya 1 sampai 5.");
                    break;
            }
        }
    }

    static void tambahData(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Asal Daerah: ");
        String asalDaerah = scanner.nextLine();

        dataMahasiswa[countMahasiswa++] = new Mahasiswa(nim, nama, asalDaerah);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    static void tampilkanData() {
        for (int i = 0; i < countMahasiswa; i++) {
            Mahasiswa m = dataMahasiswa[i];
            System.out.println("NIM    : " + m.nim);
            System.out.println("Nama   : " + m.nama);
            System.out.println("Asal : " + m.asalDaerah);
            System.out.println();
        }
    }

    static void cariData(Scanner scanner) {
        System.out.print("Cari berdasarkan (1) NIM atau (2) Asal daerah: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();
                for (Mahasiswa m : dataMahasiswa) {
                    if (m != null && m.nim.equals(nim)) {
                        System.out.println("NIM    : " + m.nim);
                        System.out.println("Nama   : " + m.nama);
                        System.out.println("Asal : " + m.asalDaerah);
                        return;
                    }
                }
                System.out.println("Data tidak ditemukan.");
                break;
            case 2:
                System.out.print("Masukkan Asal Daerah: ");
                String alamat = scanner.nextLine();
                boolean found = false;
                for (Mahasiswa m : dataMahasiswa) {
                    if (m != null && m.asalDaerah.equals(alamat)) {
                        System.out.println("NIM    : " + m.nim);
                        System.out.println("Nama   : " + m.nama);
                        System.out.println("Asal : " + m.asalDaerah);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Data tidak ketemu.");
                }
                break;
            default:
                System.out.println("Pilihan hanya 1 dan 2.");
                break;
        }
    }

    static void hapusData(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
        String nim = scanner.nextLine();

        for (int i = 0; i < countMahasiswa; i++) {
            if (dataMahasiswa[i] != null && dataMahasiswa[i].nim.equals(nim)) {
                System.arraycopy(dataMahasiswa, i + 1, dataMahasiswa, i, countMahasiswa - i - 1);
                dataMahasiswa[--countMahasiswa] = null;
                System.out.println("Data dihapus.");
                return;
            }
        }
        System.out.println("Data tidak ketemu.");
    }
}