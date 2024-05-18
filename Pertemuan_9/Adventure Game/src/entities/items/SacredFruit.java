package entities.items;

import entities.Item;

public class SacredFruit extends Item {
    public SacredFruit() {
        super("Sacred Fruit", "Increases max health by 7 permanently.", "consumable", "add max health", 7);
    }
}
