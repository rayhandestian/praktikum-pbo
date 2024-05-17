package entities;

public class Enemy {
    private final String name;
    private int health;
    private final int maxHealth;
    private final int damage;
    private final int experience;

    public Enemy(String name, int health, int damage, int experience) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getDamage() {
        return damage;
    }

//    public void setHealth(int health) {
//        this.health = health;
//    }
//
//    public void setDamage(int damage) {
//        this.damage = damage;
//    }

    public int getExperience() {
        return experience;
    }

    public void takeDamage(int damage) {
        System.out.println("[You dealt " + damage + " damage to " + this.name + "!]");
        this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}