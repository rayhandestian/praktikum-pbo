package order;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        for (Order existingOrder : orders) {
            if (existingOrder.getOrderId().equals(order.getOrderId())) {
                throw new IllegalArgumentException("Order with ID already exists.");
            }
        }
        orders.add(order);
    }

    public void removeOrder(String orderId) {
        orders.removeIf(order -> order.getOrderId().equals(orderId));
    }

    public Order findOrderById(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public ArrayList<Order> getOrders() {
        return new ArrayList<>(orders);
    }
}
