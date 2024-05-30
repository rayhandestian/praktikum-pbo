package com.tutorial;

public class HeroIntel extends Hero{
    String type = "Intel";

    HeroIntel(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Type: " + this.type);
        super.display();
    }
}
