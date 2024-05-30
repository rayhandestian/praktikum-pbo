package entities.items;

import entities.Item;

public class CommonHealthPotion extends Item {
    public CommonHealthPotion() {
        super("common_health_potion", "Common Health Potion", "Restores 20 health.", "consumable", "add health", 20);
    }
}