package com.toko;

public class TesToko {
    public static void main(String[] args) {
        TokoBuku toko = new TokoBuku();
        toko.tambahBuku(new Buku("Harry Potter", "J.K. Rowling", 300000, 25));
        toko.tambahBuku(new Buku("UML", "Ivar Jacobson", 400000, 5));

        System.out.println("Total buku: " + TokoBuku.getTotalBuku());
        toko.jualBuku("Harry Potter", 2);
        toko.tampilkanStokBatas(15);
    }
}
