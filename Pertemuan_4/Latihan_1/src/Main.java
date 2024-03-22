public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }

        System.out.println("Isi stack1:");
        stack1.displayStack();

        for (int i = 10; i < 20; i++) {
            stack2.push(i);
        }

        System.out.println("\nIsi stack2:");
        stack2.displayStack();

        System.out.println("\nPopping stack1:");
        for (int i = 0; i < 3; i++) {
            int poppedItem = stack1.pop();
            System.out.println("Popped: " + poppedItem);
        }

        System.out.println("\nIsi stack1 (setelah pop):");
        stack1.displayStack();
    }
}
