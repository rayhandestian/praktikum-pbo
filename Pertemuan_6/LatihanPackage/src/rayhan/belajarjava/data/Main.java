package rayhan.belajarjava.data;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Indomie", 3000);
        Product product2 = new Product("Pepsodent", 10000);
        Product product3 = new Product("Head & Shoulders", 20000);
        Product product4 = new Product("Lifebuoy", 5000);

//        System.out.println(product1.name + " | " + product1.price);
//        System.out.println(product2.name + " | " + product2.price);

        ArrayList<Product> listProduct = new ArrayList<>();

        // Add
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);

        System.out.println("\nList Product:");
        for(Product product : listProduct) {
            System.out.println(product.name + " | " + product.price);
        }

        // Remove
        listProduct.remove(product2);
        System.out.println("\nList Product (after remove):");
        for(Product product : listProduct) {
            System.out.println(product.name + " | " + product.price);
        }

        // Set
        listProduct.set(0, product2);
        System.out.println("\nList Product (after set):");
        for(Product product : listProduct) {
            System.out.println(product.name + " | " + product.price);
        }
    }
}
