public abstract class ElectronicDevice {
    protected String brand;
    protected String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();
}
