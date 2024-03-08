public class App {
    public static void main(String[] args) {

        // Input data langsung biar gampang
        String nama = "Rayhan Surya Destian";
        var nim = "105222024";
        long nilaiTugas = 99, nilaiUTS = 77, nilaiUAS = 100;

        // Auto do'a
        for (int i = 1; i <= 100; i++) {
            System.out.println(nama + " akan dapat nilai A pada praktikum PBO (" + i + ")");
        }

        // Menampilkan variable
        System.out.println("Mahasiswa: " + nama + " / " + nim);
        System.out.println("Nilai tugas: " + nilaiTugas + ", Nilai UTS: " + nilaiUTS + ", Nilai UAS: " + nilaiUAS);

        // Hitung rata-rata nilai dan cek apakah lulus atau tidak
        var rataRata = (nilaiTugas+nilaiUTS+nilaiUAS)/3;
        if (rataRata < 60) {
            System.out.println("TYDAK LULUS, nilai: " + rataRata);
        }
        else {
            System.out.println("LULUS, nilai: " + rataRata);
        }


    }
}
