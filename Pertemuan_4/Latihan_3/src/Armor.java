public class Armor {
    public double defensePower;
    public String name;

    public Armor(String name, double defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    public void display() {
        System.out.println("Armor: " + name + ", Defense Power: " + defensePower);
    }
}
