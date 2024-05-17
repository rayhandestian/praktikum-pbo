package entities;

public class Player {
    private int health;
    private int maxHealth;
    private int attack;
    private int coins;
    private Inventory inventory;

    public Player() {
        this.health = 100;
        this.maxHealth = 100;
        this.attack = 10;
        this.coins = 15;
        this.inventory = new Inventory();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.min(health, maxHealth);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void increaseMaxHealth(int amount) {
        maxHealth += amount;
        System.out.println("[Max health increased by " + amount + ". Now: " + maxHealth + "]");
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void increaseAttack(int amount) {
        attack += amount;
        System.out.println("[Attack power increased by " + amount + ". Now: " + attack + "]");
    }

    public int getCoins() {
        return coins;
    }

    public void addCoins(int amount) {
        System.out.println("[You found " + amount + " coins!]");
        coins += amount;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void addItemToInventory(Item item) {
        if (inventory.size() < 16) {
            inventory.add(item);
        }
    }

    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        System.out.println("[You took " + damage + " damage!]");
        health -= damage;
    }
}
