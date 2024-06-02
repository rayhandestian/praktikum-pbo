package com.tutorial;
import com.hero.Hero;
import com.hero.HeroAgility;
import com.hero.HeroIntel;
import com.hero.HeroStrength;

public class Main {
    public static void main(String[] args) {
        HeroAgility heroAgility = new HeroAgility("Mococo Abyssgard");
        heroAgility.display();
        heroAgility.levelUp();

        HeroIntel heroIntel = new HeroIntel("Amelia Watson");
        heroIntel.display();
        heroIntel.levelUp();

        HeroStrength heroStrength = new HeroStrength("Calliope Mori");
        heroStrength.display();
        heroStrength.levelUp();
        heroStrength.levelUp();

        // Normal Hero
        // Hero hero = new Hero("The Legend");
        // hero.display();
    }
}
