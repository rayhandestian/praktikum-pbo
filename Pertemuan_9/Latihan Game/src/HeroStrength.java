public class HeroStrength extends Hero {
    String type = "Strength";

    public HeroStrength(String name, int attackPower, int health) {
        super(name, attackPower, health);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(this.name + " (Strength) receives damage: " + damage/2 + " (only half)");
        super.health = super.health - (damage / 2);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" - Type: " + this.type);
    }
}
