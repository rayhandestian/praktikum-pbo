public class Armor {
    public double defensePower;
    public String name;

    // Constructor
    public Armor(String name, double defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    // Display method
    public void display() {
        System.out.println("Armor: " + name + ", Defense Power: " + defensePower);
    }
}
