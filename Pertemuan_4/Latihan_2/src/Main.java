public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(7);
        Box box3 = new Box();

        System.out.println("Volume box1: " + box1.volume());
        System.out.println("Volume box2: " + box2.volume());
        System.out.println("Volume box3: " + box3.volume());
    }
}
