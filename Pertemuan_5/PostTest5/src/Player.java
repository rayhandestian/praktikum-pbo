public class Player {
    private String name;
    private int baseHealth = 100;
    private int baseAttack = 100;
    private int incrementHealth = 20;
    private int incrementAttack = 20;
    private int level = 1;
    private int currentHealth;
    private boolean isAlive = true;
    private Armor armor;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.currentHealth = baseHealth;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
        this.currentHealth = maxHealth();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void display() {
        System.out.printf("Player: %s\nLevel: %d\nHealth: %d/%d\nAttack: %d\nAlive: %s\n\n",
                name, level, currentHealth, maxHealth(), baseAttack + (weapon != null ? weapon.getAttack() : 0), isAlive ? "true" : "false");
    }

    public void attack(Player other) {
        int attackPower = baseAttack + (weapon != null ? weapon.getAttack() : 0);
        System.out.printf("%s is attacking %s with %d.\n", name, other.name, attackPower);
        other.defence(attackPower);
        level++;
        this.currentHealth = maxHealth();
    }

    public void defence(int damage) {
        int defencePower = armor != null ? armor.getDefencePower() : 0;
        System.out.printf("%s defense power: %d\n", name, defencePower);
        int deltaDamage = (damage > defencePower) ? (damage - defencePower) : 0;
        System.out.printf("%s damage earned: %d\n\n", name, deltaDamage);
        currentHealth -= deltaDamage;
        if (currentHealth <= 0) {
            isAlive = false;
            currentHealth = 0;
        }
    }

    private int maxHealth() {
        return baseHealth + level * incrementHealth + (armor != null ? armor.getAddHealth() : 0);
    }
}
