package com.hero;

public class Hero implements IAttack {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("My name is " + this.name);
        System.out.println("My health is " + this.health);
    }

    public void atttack(Hero enemy) {
        System.out.println(this.name + " attacks " + enemy.name);
    }
}
