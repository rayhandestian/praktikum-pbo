package entities.items;

import entities.Item;

public class DragonsHeart extends Item {
    public DragonsHeart() {
        super("dragons_heart", "Dragon's Heart", "Increases attack by 10 permanently.", "consumable", "add attack", 10);
    }
}