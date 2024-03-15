public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Rayhan", "Destian");
        sayHello("Rayhan");
        var a = 10;
        var b = 20;
        System.out.println(sum(a, b));
        sayCongrats("Rayhan", 80, 90, 79, 69);
        System.out.println(factorialRecursive(5));
    }

    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // Method Overloading
    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    // Method with return value
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    // Array things(?) in paramater
    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ". Anda lulus!");
        }
        else {
            System.out.println("Anda tidak lulus :(");
        }
    }

    // Recursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
    
}
