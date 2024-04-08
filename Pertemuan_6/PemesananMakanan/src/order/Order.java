package order;

import java.util.ArrayList;
import menu.MenuItem;

public class Order {
    private String orderId;
    private ArrayList<MenuItem> items;

    public Order(String orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public ArrayList<MenuItem> getItems() {
        return new ArrayList<>(items);
    }

    public String getOrderId() {
        return orderId;
    }
}
