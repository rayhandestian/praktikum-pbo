public class Main {
    public static void main(String[] args) {
        Television tv = new Television("Samsang", "QLED 5m SUPER BRIGHT", 500, true);
        Refrigerator fridge = new Refrigerator("idk a refrigerator brand", "idk a refrigerator model", 50, true);

        tv.turnOn();
        tv.displayInfo();
        tv.turnOff();

        fridge.turnOn();
        fridge.displayInfo();
        fridge.turnOff();
    }
}
