public class ObjekPenghitung {
    private static int jumlahObjek = 0;

    // Constructor yang meningkatkan nilai variabel static setiap kali objek baru dibuat
    public ObjekPenghitung() {
        jumlahObjek++;
    }

    // Method static untuk mendapatkan jumlah total objek yang telah dibuat
    public static int getJumlahObjek() {
        return jumlahObjek;
    }
}
