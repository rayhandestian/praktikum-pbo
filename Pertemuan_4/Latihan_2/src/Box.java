public class Box {
    public int width;
    public int height;
    public int depth;

    // Constructor 3 parameter
    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor 1 parameter
    public Box(int length) {
        width = height = depth = length;
    }

    // Constructor no parameter
    public Box() {
        width = height = depth;
    }

    // Menghitung volume
    public int volume() {
        return width * height * depth;
    }
}
