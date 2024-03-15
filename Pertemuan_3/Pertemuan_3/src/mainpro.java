public class mainpro {

    int [] angka;
    String [] pesan;

    public mainpro(int indeksnya) {
        angka = new int[indeksnya];
        pesan = new String[indeksnya];
    }

    public static void main(String[] args) {
        mainpro objek = new mainpro(5);
        mainpro [] objekKedua = new mainpro[3];

        objek.angka[0] = 0;
        objek.angka[1] = 1;

        objek.pesan[0] = "Pesan A";
        objek.pesan[1] = "Pesan B";

        System.out.println(objek.angka[0]);
        System.out.println(objek.angka[1]);

        objekKedua[0] = objek;
        System.out.println(objekKedua[0].pesan[1]);
    }
}
