package com.tutorial;

public class Hero {
    String name;

    Hero(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + this.name);
    }

    void attack(Hero enemy) {
        System.out.println(this.name + " is attacking " + enemy.name);
    }
}
