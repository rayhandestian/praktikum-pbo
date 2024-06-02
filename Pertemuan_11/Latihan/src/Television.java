public class Television extends ElectronicDevice implements Switchable {
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, String model, int screenSize, boolean isSmart) {
        super(brand, model);
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the TV...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV...");
    }

    @Override
    public void displayInfo() {
        System.out.println("TV Brand: " + brand);
        System.out.println("TV Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Smart TV: " + (isSmart ? "Yes" : "No"));
    }
}
