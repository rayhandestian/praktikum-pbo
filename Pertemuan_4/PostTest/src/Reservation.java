public class Reservation {
    private Room reservedRoom;
    private String guestName;
    private int numberOfNights;
    private double totalCharge;

    public Reservation(Room reservedRoom, String guestName, int numberOfNights) {
        this.reservedRoom = reservedRoom;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
        this.totalCharge = reservedRoom.getRate() * numberOfNights;
        System.out.println("[SYSTEM] Constructor for Reservation is called.");
    }

    // Getter methods
    public Room getReservedRoom() {
        return reservedRoom;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getTotalCharge() {
        return totalCharge;
    }
}
