public class Mahasiswa {
    private String nim;
    private String nama;
    private double nilai;

    // Constructor dengan semua parameter
    public Mahasiswa(String nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    // Constructor dengan nilai default
    public Mahasiswa(String nim, String nama) {
        this(nim, nama, 0);
    }

    // Getter dan setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
