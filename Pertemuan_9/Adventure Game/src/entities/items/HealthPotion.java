package entities.items;

import entities.Item;

public class HealthPotion extends Item {
    public HealthPotion() {
        super("Health Potion", "Restores 25% of max health.", "addHealth");
    }
}