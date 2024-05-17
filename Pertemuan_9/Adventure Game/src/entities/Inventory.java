package entities;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    private static final int MAX_CAPACITY = 16;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        if (items.size() < MAX_CAPACITY) {
            items.add(item);
            return true;
        }
        return false;
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

//    public void useItem(Item item, Player player) {
//        if (items.contains(item)) {
//            item.use(player);
//            if (item.getType().equals("addHealth")) {
//                player.setHealth(player.getHealth() + item.getValue());
//                items.remove(item);
//            }
//        }
//    }

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
