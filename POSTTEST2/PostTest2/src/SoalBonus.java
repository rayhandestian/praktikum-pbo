public class SoalBonus {
    public static void main(String[] args) {

        String[][] mahasiswa = {
            {"Rayhan Surya Destian", "105222024", "99", "77", "100"},
            {"Zaky Tabrani", "105222025", "85", "85", "100"},
            {"Siapalah yg ga lulus", "105222999", "11", "3", "25"}
        };

        for (int i = 0; i < mahasiswa.length; i++) {
            String nama = mahasiswa[i][0];
            String nim = mahasiswa[i][1];
            long nilaiTugas = Long.parseLong(mahasiswa[i][2]);
            long nilaiUTS = Long.parseLong(mahasiswa[i][3]);
            long nilaiUAS = Long.parseLong(mahasiswa[i][4]);

            // Menampilkan variable
            System.out.println("Mahasiswa: " + nama + " / " + nim);
            System.out.println("Nilai tugas: " + nilaiTugas + ", Nilai UTS: " + nilaiUTS + ", Nilai UAS: " + nilaiUAS);

            // Hitung rata-rata nilai dan cek apakah lulus atau tidak
            var rataRata = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;
            if (rataRata < 60) {
                System.out.println("TYDAK LULUS, nilai: " + rataRata);
            } else {
                System.out.println("LULUS, nilai: " + rataRata);
            }
        }
    }
}
