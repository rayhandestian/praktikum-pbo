package entities;

public abstract class Item {
    protected String id;
    protected String name;
    protected String description;
    protected String type;
    protected String stats;
    protected int value;

    public Item(String id, String name, String description, String type, String stats, int value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.stats = stats;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getKeyStats() {
        return stats;
    }

    public int getValue() {
        return value;
    }

    public void use(Player player) {
        switch (stats) {
            case "add health":
                player.setHealth(Math.min(player.getHealth() + value, player.getMaxHealth()));
                System.out.println("Used " + getName() + ". Restored " + value + " health.");
                break;
            case "add max health":
                player.increaseMaxHealth(value);
                System.out.println("Used " + getName() + ". Max health increased by " + value + ".");
                break;
            case "add attack":
                player.increaseAttack(value);
                System.out.println("Used " + getName() + ". Attack power increased by " + value + ".");
                break;
            default:
                System.out.println("Used " + getName() + ". No effect.");
                break;
        }
        player.removeItemFromInventory(this);
    }
}
