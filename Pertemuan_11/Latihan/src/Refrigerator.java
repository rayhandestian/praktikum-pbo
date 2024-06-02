public class Refrigerator extends ElectronicDevice implements Switchable {
    private double capacity;
    private boolean hasFreezer;

    public Refrigerator(String brand, String model, double capacity, boolean hasFreezer) {
        super(brand, model);
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is cooling...");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is turned off...");
    }

    @Override
    public void displayInfo() {
        System.out.println("Refrigerator Brand: " + brand);
        System.out.println("Refrigerator Model: " + model);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Has Freezer: " + (hasFreezer ? "Yes" : "No"));
    }
}
