package universitas;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<String> nilai;
    private static int jumlahMahasiswa = 0;
    private String namaDosenPengajar;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = new ArrayList<>();
        jumlahMahasiswa++;
    }

    public void tambahNilai(String nilai) {
        this.nilai.add(nilai);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public ArrayList<String> getNilai() {
        return nilai;
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public void setNamaDosenPengajar(String namaDosen) {
        this.namaDosenPengajar = namaDosen;
    }

    public String getNamaDosenPengajar() {
        return namaDosenPengajar;
    }
}