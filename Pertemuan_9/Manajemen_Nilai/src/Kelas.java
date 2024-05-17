import java.util.ArrayList;

public class Kelas {
    private String namaKelas;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private static int jumlahMahasiswa = 0;

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
        jumlahMahasiswa++;
    }

    public void hapusMahasiswa(Mahasiswa m) {
        if (daftarMahasiswa.remove(m)) {
            jumlahMahasiswa--;
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return daftarMahasiswa.isEmpty() ? 0 : total / daftarMahasiswa.size();
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
}
