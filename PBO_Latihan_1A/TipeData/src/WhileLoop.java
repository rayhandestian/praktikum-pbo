public class WhileLoop {
    public static void main(String[] args) {
        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        var counter2 = 1;
        
        do {
            System.out.println("Perulangan-2 ke-" + counter2);
            counter2++;
        } while (counter2 <= 10);
    }
}
