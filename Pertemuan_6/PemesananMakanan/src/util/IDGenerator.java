package util;

public class IDGenerator {
    private static int itemCount = 0;
    private static int orderCount = 0;

    public static String generateMenuItemID() {
        return "MENU-" + (++itemCount);
    }

    public static String generateOrderID() {
        return "ORDER-" + (++orderCount);
    }
}
