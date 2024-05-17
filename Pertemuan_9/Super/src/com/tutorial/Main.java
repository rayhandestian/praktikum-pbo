package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "All Might";

        hero1.display();
        hero2.display();
        hero2.displaySuper();
    }
}