import menu.MenuDatabase;
import menu.MenuItem;
import order.Order;
import order.OrderManager;
import util.IDGenerator;

public class Main {
    public static void main(String[] args) {
        // Buat instance MenuDatabase & OrderManager
        MenuDatabase menuDB = new MenuDatabase();
        OrderManager orderManager = new OrderManager();

        // Adding some delicious menu items
        String menuItemId1 = IDGenerator.generateMenuItemID();
        String menuItemId2 = IDGenerator.generateMenuItemID();
        String menuItemId3 = IDGenerator.generateMenuItemID();
        menuDB.addMenuItem(new MenuItem(menuItemId1, "Nasi Ayam", 12000));
        menuDB.addMenuItem(new MenuItem(menuItemId2, "Mie Ayam", 10000));
        menuDB.addMenuItem(new MenuItem(menuItemId3, "Indomie Goreng", 5000));

        // Display semua menu items
        System.out.println("Menu Items:");
        for (MenuItem item : menuDB.getMenuItems()) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
        }

        // Create order
        String orderId1 = IDGenerator.generateOrderID();
        Order order1 = new Order(orderId1);
        order1.addItem(menuDB.findMenuItemById(menuItemId1)); // Add item to order
        order1.addItem(menuDB.findMenuItemById(menuItemId3));

        // Create order
        String orderId2 = IDGenerator.generateOrderID();
        Order order2 = new Order(orderId2);
        order2.addItem(menuDB.findMenuItemById(menuItemId2));
        order2.addItem(menuDB.findMenuItemById(menuItemId3));

        // Add order to OrderManager
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);

        // Menampilkan semua orders & items-nya
        System.out.println("\nOrders:");
        for (Order ord : orderManager.getOrders()) {
            System.out.println("Order ID: " + ord.getOrderId());
            for (MenuItem orderedItem : ord.getItems()) {
                System.out.println("   Item: " + orderedItem.getName() + ", Price: " + orderedItem.getPrice());
            }
        }
    }
}
