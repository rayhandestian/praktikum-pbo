package com.hero;

public abstract class Hero {
    private String name;
    private int level;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
    }

    public void display() {
        System.out.println("My name is " + this.name);
        System.out.println("My level is " + this.level);
    }

    public abstract void levelUp();

    public void setLevel(int level) {
        this.level = level;
    }
}
