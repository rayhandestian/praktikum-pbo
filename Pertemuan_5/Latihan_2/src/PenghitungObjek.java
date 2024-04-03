public class PenghitungObjek {
    public static void main(String[] args) {
        // Membuat 3 objek dari kelas ObjekPenghitung
        ObjekPenghitung obj1 = new ObjekPenghitung();
        ObjekPenghitung obj2 = new ObjekPenghitung();
        ObjekPenghitung obj3 = new ObjekPenghitung();
        
        System.out.println("Jumlah total objek ObjekPenghitung yang telah dibuat: " + ObjekPenghitung.getJumlahObjek());
    }
}
