package entities.items;

import entities.Item;

public class RiceBall extends Item {
    public RiceBall() {
        super("rice_ball", "Rice Ball", "Restores 10 health.", "consumable", "add health", 10);
    }
}