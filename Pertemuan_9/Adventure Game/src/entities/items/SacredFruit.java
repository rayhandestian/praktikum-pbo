package entities.items;

import entities.Item;

public class SacredFruit extends Item {
    public SacredFruit() {
        super("sacred_fruit", "Sacred Fruit", "Increases max health by 20 permanently.", "consumable", "add max health", 20);
    }
}
