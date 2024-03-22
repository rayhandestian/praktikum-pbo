public class Weapon {
    public double attackPower;
    public String name;

    // Constructor
    public Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    // Display method
    public void display() {
        System.out.println("Weapon: " + name + ", Attack Power: " + attackPower);
    }
}
