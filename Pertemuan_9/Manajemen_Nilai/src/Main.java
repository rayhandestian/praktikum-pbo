import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("001", "Gura", 85);
        Mahasiswa m2 = new Mahasiswa("002", "Watson", 90);
        Mahasiswa m3 = new Mahasiswa("003", "Kiara", 88);
        Mahasiswa m4 = new Mahasiswa("004", "Calli");
        Mahasiswa m5 = new Mahasiswa("005", "Ina", 91);
        Mahasiswa m6 = new Mahasiswa("006", "Mumei");
        Mahasiswa m7 = new Mahasiswa("007", "Kronii", 75);
        Mahasiswa m8 = new Mahasiswa("008", "Fauna", 95);
        Mahasiswa m9 = new Mahasiswa("009", "Bae", 80);
        Mahasiswa m10 = new Mahasiswa("010", "Irys", 82);

        // Membuat objek Kelas
        Kelas k1 = new Kelas("Astrophysics");
        Kelas k2 = new Kelas("Advanced Mathematics");
        Kelas k3 = new Kelas("Artificial Intelligence");

        // Menambahkan mahasiswa ke dalam kelas
        k1.tambahMahasiswa(m1);
        k1.tambahMahasiswa(m2);
        k2.tambahMahasiswa(m3);
        k2.tambahMahasiswa(m4);
        k2.tambahMahasiswa(m5);
        k3.tambahMahasiswa(m6);
        k3.tambahMahasiswa(m7);
        k3.tambahMahasiswa(m8);
        k3.tambahMahasiswa(m9);
        k3.tambahMahasiswa(m10);

        // Inisiasi ArrayList untuk kelas
        ArrayList<Kelas> daftarKelas = new ArrayList<>();
        daftarKelas.add(k1);
        daftarKelas.add(k2);
        daftarKelas.add(k3);

        displayRataRata(daftarKelas);
        displayRataRataSemuaKelas(daftarKelas);
    }

    public static void displayRataRata(ArrayList<Kelas> daftarKelas) {
        for (Kelas k : daftarKelas) {
            System.out.println(k.getNamaKelas() + " Rata-Rata Nilai: " + k.hitungRataRata());
        }
    }

    public static void displayRataRataSemuaKelas(ArrayList<Kelas> daftarKelas) {
        double totalNilai = 0;
        int totalMahasiswa = 0;
        for (Kelas k : daftarKelas) {
            totalNilai += k.hitungRataRata() * k.getJumlahMahasiswa();
            totalMahasiswa += k.getJumlahMahasiswa();
        }
        double rataRata = totalNilai / totalMahasiswa;
        System.out.println("Total Mahasiswa: " + totalMahasiswa + ", Rata-Rata Nilai Semua Kelas: " + rataRata);
    }
}
