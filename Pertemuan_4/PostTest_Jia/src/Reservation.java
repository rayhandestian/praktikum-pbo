public class Reservation {
    private Room reservedRoom;
    private String guestName;
    private int numberOfNights;
    private double totalCharge;

    public Reservation (Room reservedRoom, String guestName, int numberOfNights){
        this.reservedRoom = reservedRoom;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    //totalCharge dihitung berdasarkan rate dari reservedRoom dikalikan dengan numberOfNights
        this.totalCharge = reservedRoom.getRate() * numberOfNights;
        System.out.println("Constructor Reservation is called for " + guestName + " in room " + reservedRoom.getRoomNumber() + " for " + numberOfNights + " nights");
    }

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
