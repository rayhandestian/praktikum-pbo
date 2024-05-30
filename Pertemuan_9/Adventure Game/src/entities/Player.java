package entities;
import core.AccountManager;

public class Player {
    private String username;
    private int health;
    private int maxHealth;
    private int attack;
    private int regionVentured;
    private Inventory inventory;

    public Player(String username) {
        this.username = username;
        this.health = 100;
        this.maxHealth = 100;
        this.attack = 10;
        this.regionVentured = 0;
        this.inventory = new Inventory(this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getRegionVentured() {
        return regionVentured;
    }

    public void addRegionVentured() {
        regionVentured++;
    }

    public void setRegionVentured(int regionVentured) {
        this.regionVentured = regionVentured;
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
