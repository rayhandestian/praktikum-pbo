package com.terminal;

// Visibilitas untuk semua
public class Console {
    public static void log(String message) {
        System.out.println(message);
    }
}

// Hanya bisa diakses dari package com.terminal
class Terminal {
    public static void log(String message) {
        System.out.println(message);
    }
}