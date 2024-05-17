package com.tutorial;

public class HeroStrength extends Hero{
    double defencePower;

    // overriding method
    void display() {
        System.out.println("\nHero Strength");
        System.out.println("Name: " + this.name);
        System.out.println("Defence Power: " + this.defencePower);
    }
}
