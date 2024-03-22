public class Stack {
    private int[] stck = new int[10];
    private int index;

    public Stack() {
        index = -1;
    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Stack penuh.");
        } else {
            stck[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            return stck[index--];
        }
    }

    public void displayStack() {
        for (int i = 0; i <= index; i++) {
            System.out.print(stck[i] + " ");
        }
        System.out.println();
    }
}
