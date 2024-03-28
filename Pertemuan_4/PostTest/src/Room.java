public class Room {
    private int roomNumber;
    private String roomType;
    private boolean occupied;
    private double rate;

    public Room() {
        this.roomNumber = 0;
        this.roomType = "Standard";
        this.occupied = false;
        this.rate = 100.0;
        System.out.println("[SYSTEM] Default Constructor for Room is called.");
    }

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = false;
        this.rate = roomType.equals("Deluxe") ? 200.0 : 100.0;
        System.out.println("[SYSTEM] Constructor Room with roomNumber and roomType is called.");
    }

    public Room(int roomNumber, String roomType, boolean occupied, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
        System.out.println("[SYSTEM] Constructor Room with all parameters is called.");
    }

    // Getter methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getRate() {
        return rate;
    }

    // Setter methods
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
