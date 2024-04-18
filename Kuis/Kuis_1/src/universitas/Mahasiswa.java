package universitas;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<String> nilai;
    private static int jumlahMahasiswa = 0;
    private Dosen dosenPengajar;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = new ArrayList<>();
        jumlahMahasiswa++;
    }

    public void tambahNilai(String mataKuliah) {
        nilai.add(mataKuliah);
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.print("Nilai: ");
        for (String n : nilai) {
            System.out.print(n + ", ");
        }
        System.out.println();
        if (dosenPengajar != null) {
            System.out.println("Dosen Pengajar: " + dosenPengajar.getNamaDosen());
        }
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public void setDosenPengajar(Dosen dosen) {
        this.dosenPengajar = dosen;
    }
}
