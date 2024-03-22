public class Player {
    public String name;
    public double health;
    public int level;
    public Weapon weapon;
    public Armor armor;

    // Constructor
    public Player(String name, double health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // Attack method
    public void attack(Player opponent) {
        System.out.println(this.name + " is attacking " + opponent.name);
        opponent.defense(this.weapon.attackPower);
    }

    // Defense method
    public void defense(double attackPower) {
        double damage;
        if (this.armor.defensePower < attackPower) {
            damage = attackPower - this.armor.defensePower;
            this.health -= damage;
            System.out.println(this.name + " received " + damage + " damage.");
        } else {
            System.out.println(this.name + " blocked the attack!");
        }
    }

    // Equip weapon
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(this.name + " equipped " + weapon.name);
    }

    // Equip armor
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(this.name + " equipped " + armor.name);
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
        this.weapon.display();
        this.armor.display();
    }
}
