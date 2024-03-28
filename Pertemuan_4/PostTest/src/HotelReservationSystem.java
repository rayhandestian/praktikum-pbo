public class HotelReservationSystem {
    public static void main(String[] args) {
        // Create hotels
        Hotel hotel1 = new Hotel("Shangri-La Hotel", 100);
        Hotel hotel2 = new Hotel("Hotel Indonesia", 50, 15);

        // Shangri-La reservations
        Reservation reservation1 = new Reservation(hotel1.getRooms()[0], "Hoshimachi Suisei", 3);
        
        // Hotel Indonesia reservations
        Reservation reservation2 = new Reservation(hotel2.getRooms()[2], "Kanade", 4);
        Reservation reservation3 = new Reservation(hotel2.getRooms()[9], "Kazama Iroha", 3);

        printReservationDetails(reservation1);
        printReservationDetails(reservation2);
        printReservationDetails(reservation3);
    }

    static void printReservationDetails(Reservation reservation) {
        System.out.println("\nReservation Details:");
        System.out.println("--------------------");
        System.out.println("Guest Name: " + reservation.getGuestName());
        System.out.println("Room Number: " + reservation.getReservedRoom().getRoomNumber());
        System.out.println("Room Type: " + reservation.getReservedRoom().getRoomType());
        System.out.println("Duration: " + reservation.getNumberOfNights() + " nights");
        System.out.println("Total Charge: $" + reservation.getTotalCharge());
    }
    
}
