public class ManajemenGaji {
    public static void main(String[] args) {
        // Membuat objek karyawan
        Karyawan karyawan1 = new Karyawan("Shirakami", "K001", 5000);
        Karyawan karyawan2 = new Karyawan("Fubuki", "K002", 6000);

        // Mengatur bonus dan potongan
        karyawan1.setBonus(500);
        karyawan1.setPotongan(200);
        karyawan2.setBonus(700);
        karyawan2.setPotongan(400);

        // Menampilkan informasi
        System.out.println("ID karyawan: " + karyawan1.getIdKaryawan() + ", Nama: " + karyawan1.getNama() + ", Gaji bersih: $" + karyawan1.hitungGajiBersih());
        System.out.println("ID karyawan: " + karyawan2.getIdKaryawan() + ", Nama: " + karyawan2.getNama() + ", Gaji bersih: $" + karyawan2.hitungGajiBersih());
    }
}
