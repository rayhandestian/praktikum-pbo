import universitas.Mahasiswa;
import universitas.Dosen;

public class Main {
    public static void main(String[] args) {
        Mahasiswa ali = new Mahasiswa("Ali", "12345");
        ali.tambahNilai("PBO");
        ali.tambahNilai("Matematika");
        ali.tambahNilai("Fisika");

        Mahasiswa rayhan = new Mahasiswa("Rayhan", "105222024");
        rayhan.tambahNilai("PBO");
        rayhan.tambahNilai("Matematika");
        rayhan.tambahNilai("Fisika");

        Dosen dosenPBO = new Dosen("Budi");
        System.out.println("Nama Dosen: " + dosenPBO.getNamaDosen());

        Dosen dosenPengajar = new Dosen("Pak Joko");
        ali.setDosenPengajar(dosenPengajar);
        rayhan.setDosenPengajar(dosenPengajar);

        System.out.println("Total Jumlah Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());

        System.out.println("\nInfo Mahasiswa:");
        ali.tampilkanInfo();
        rayhan.tampilkanInfo();
    }
}
