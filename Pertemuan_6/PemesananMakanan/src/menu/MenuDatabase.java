package menu;
import java.util.ArrayList;

public class MenuDatabase {
    private ArrayList<MenuItem> menuItems;

    public MenuDatabase() {
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        for (MenuItem existingItem : menuItems) {
            if (existingItem.getId().equals(item.getId())) {
                throw new IllegalArgumentException("Item with ID already exists.");
            }
        }
        menuItems.add(item);
    }

    public void removeMenuItem(String id) {
        menuItems.removeIf(item -> item.getId().equals(id));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems);
    }

    public MenuItem findMenuItemById(String id) {
        for (MenuItem item : menuItems) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<MenuItem> findMenuItemByName(String name) {
        ArrayList<MenuItem> foundItems = new ArrayList<>();
        for (MenuItem item : menuItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
