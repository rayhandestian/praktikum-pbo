public class ForEach {
    public static void main(String[] args) {

        String[] array = {
            "Rayhan", "Surya", "Destian",
            "Programmer", "Zaman", "Now"
        };

        // For not each
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        // For Each
        for (var value : array) {
            System.out.print(value + " ");
        }
    }
}
