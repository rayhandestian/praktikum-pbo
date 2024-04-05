package com.tutorial;
import com.terminal.Console;
import com.terminal.Coba;
import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Fubuki");
        player1.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());

        Coba.log("Hello");

        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}
