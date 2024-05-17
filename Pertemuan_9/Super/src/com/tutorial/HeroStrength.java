package com.tutorial;

public class HeroStrength extends Hero{
    String name = "Class Strength";

    void display() {
        System.out.println("Name: " + this.name);
        this.dummyMethod();
    }

    void displaySuper() {
        System.out.println("Name: " + super.name);
        super.dummyMethod();
    }

    void dummyMethod() {
        System.out.println("Method Sub Class");
    }
}
