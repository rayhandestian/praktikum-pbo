package entities;

public class Item {
    protected String name;
    protected String description;
    protected String type;

    public Item(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
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

    public void use(Player player) {
        switch (type) {
            case "Health Potion":
                int restoreAmount = (int)(player.getMaxHealth() * 0.2);
                player.setHealth(player.getHealth() + restoreAmount);
                System.out.println("Used " + getName() + ". Restored " + restoreAmount + " health.");
                break;
            case "Strength Potion":
                int boostAmount = (int)(player.getAttack() * 0.25);
                player.setAttack(player.getAttack() + boostAmount);
                System.out.println("Used " + getName() + ". Attack power increased by " + boostAmount + ".");
                break;
            case "Sacred Fruit":
                player.increaseMaxHealth(10);
                System.out.println("Used " + getName() + ". Max health increased by 10.");
                break;
            default:
                System.out.println("Used " + getName() + ". No effect.");
                break;
        }
    }
}