package com.tutorial;

import com.terminal.Console;

// Default visibility
class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void show() {
        Console.log("Menggunakan console");
        Console.log("Player name: " + this.name);
    }
}
