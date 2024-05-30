package com.tutorial;

public class HeroStrength extends Hero{
    String type = "Strength";

    HeroStrength(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Type: " + this.type);
        super.display();
    }
}
