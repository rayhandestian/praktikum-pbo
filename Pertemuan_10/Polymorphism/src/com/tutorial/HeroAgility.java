package com.tutorial;

public class HeroAgility extends Hero{
    String type = "Agility";

    HeroAgility(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Type: " + this.type);
        super.display();
    }

    void showoff() {
        System.out.println(this.name + " is showing off their agility");
    }
}
