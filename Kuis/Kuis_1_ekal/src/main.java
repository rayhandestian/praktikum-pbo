import universitas.Mahasiswa;
import universitas.Dosen;

public class main {
    public static void main(String[] args) {
        // Membuat objek mahasiswaBaru
        Mahasiswa mahasiswaBaru1 = new Mahasiswa("Ali", "12345");
        Mahasiswa mahasiswaBaru2 = new Mahasiswa("Haekal", "222028");


        mahasiswaBaru1.tambahNilai("PBO");
        mahasiswaBaru1.tambahNilai("Matematika");
        mahasiswaBaru1.tambahNilai("Fisika");

        mahasiswaBaru2.tambahNilai("Basis Data");
        mahasiswaBaru2.tambahNilai("Statistika");

        Dosen dosenPengajar = new Dosen("Pak Joko");
        mahasiswaBaru1.setNamaDosenPengajar(dosenPengajar.getNamaDosen());

        Dosen dosenPBO = new Dosen("Budi");
        System.out.println("Nama Dosen PBO: " + dosenPBO.getNamaDosen());
        System.out.println("Dosen Pengajar untuk Mahasiswa 1: " + mahasiswaBaru1.getNamaDosenPengajar());

        System.out.println("\nMahasiswa 1:");
        System.out.println("Nama: " + mahasiswaBaru1.getNama());
        System.out.println("NIM: " + mahasiswaBaru1.getNim());
        System.out.println("Nilai Mata Kuliah:");
        for (String nilai : mahasiswaBaru1.getNilai()) {
            System.out.println(nilai);
        }

        System.out.println("\nMahasiswa 2:");
        System.out.println("Nama: " + mahasiswaBaru2.getNama());
        System.out.println("NIM: " + mahasiswaBaru2.getNim());
        System.out.println("Nilai Mata Kuliah:");
        for (String nilai : mahasiswaBaru2.getNilai()) {
            System.out.println(nilai);
        }

        System.out.println("\nJumlah Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
    }
}