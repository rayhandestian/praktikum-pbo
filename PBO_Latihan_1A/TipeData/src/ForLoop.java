public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;

        for (; counter <= 10;) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        for (var counter2 = 1; counter2 <= 10; counter2++) {
            System.out.println("Perulangan-2 ke-" + counter2);
        }
    }
}
