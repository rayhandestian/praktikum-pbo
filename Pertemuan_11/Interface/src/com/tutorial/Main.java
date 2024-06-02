package com.tutorial;
import com.hero.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Naruto", 100);
        Hero hero2 = new Hero("Sasuke", 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
    }
}
