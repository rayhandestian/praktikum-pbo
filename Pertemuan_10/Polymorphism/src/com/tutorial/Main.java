package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ina");
        HeroStrength hero2 = new HeroStrength("Noel");
        hero1.display();
        hero2.display();

        // Polymorphic
        Hero hero3 = new HeroAgility("Fuwawa");
        hero3.display();

        HeroAgility hero4 = new HeroAgility("Mococo");
        hero4.display();
        hero4.showoff();

        // tidak bisa
        // HeroIntel hero4 = new Hero("Mococo");
        // hero4.display();

        // ArrayList
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4; // casting

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        // method calls
        // kumpulanHero[3].showoff(); // ini tidak bisa
        hero4.showoff();

        // applikasi
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);
    }
}
