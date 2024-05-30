package entities;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    private static final int MAX_CAPACITY = 10;
    private Player player;

    public Inventory(Player player) {
        this.items = new ArrayList<>();
        this.player = player;
    }

    public boolean addItem(Item item) {
        if (items.size() < MAX_CAPACITY) {
            items.add(item);
            return true;
        }
        return false;
    }

    public boolean removeItem(Item item) {
        if (items.remove(item)) {
            return true;
        }
        return false;
    }

    public List<Item> getItems() {
        return items;
    }

    public int size() {
        return items.size();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }
}
