public class Weapon {
    public double attackPower;
    public String name;

    public Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Weapon: " + name + ", Attack Power: " + attackPower);
    }
}
