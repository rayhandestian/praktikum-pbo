public class HotelReservationSystem {
    public static void main(String[] args) {
        // objek Hotel
        Hotel hotel1 = new Hotel("Moritz Biz Gandaria", 81);
        System.out.println();
        Hotel hotel2 = new Hotel("Beruga Mandalika", 5, 7);
        System.out.println();
        // objek Reservation
        Room room1 = hotel1.rooms[1];
        Room room2 = hotel2.rooms[5];
        Reservation reservation1 = new Reservation(room1, "Jia", 3);
        Reservation reservation2 = new Reservation(room2, "Max", 2);
        System.out.println();

        printReservationInfo(hotel1,reservation1);
        printReservationInfo(hotel2,reservation2);
    }

    private static void printReservationInfo(Hotel hotel,Reservation reservation) {
        System.out.println("===Reservation Details===");
        System.out.println("Guest Name: " + reservation.getGuestName());
        System.out.println("Hotel Name : " + hotel.getHotelname());
        System.out.println("Room Number: " + reservation.getReservedRoom().getRoomNumber());
        System.out.println("Room Type: " + reservation.getReservedRoom().getRoomType());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Total Charge: $" + reservation.getTotalCharge());
        System.out.println();
    }
}
