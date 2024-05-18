package entities.items;

import entities.Item;

public class HealthPotion extends Item {
    public HealthPotion() {
        super("Health Potion", "Restores 20 health.", "consumable", "add health", 20);
    }
}