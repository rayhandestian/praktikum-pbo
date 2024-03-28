public class Hotel {
    private String name;
    public Room[] rooms;

public Hotel (String name, Room[] rooms){
    this.name = name;
    this.rooms = rooms;
}

public Hotel (String name, int numberOfRooms){
    this.name = name;
    this.rooms = new Room[numberOfRooms];
//Gunakan sebuah loop untuk mengisi array rooms dengan objek Room
//dimana roomNumber dimulai dari 1 hingga numberOfRooms dan semua kamar bertipe "Standard"
    for (int i = 0; i<numberOfRooms; i++){
        rooms[i] = new Room(i+1, "Standard");
    }
    System.out.println("Constructor Hotel with name " + name + " and " + numberOfRooms + " Standard rooms is called");
}

public Hotel (String name, int numberOfStandardRooms, int numberOfDeluxeRooms){
    this.name = name;
    int totalRooms = numberOfStandardRooms + numberOfDeluxeRooms;
    this.rooms = new Room[totalRooms];
//Gunakan sebuah loop untuk mengisi rooms dengan objek Room
//dimana setengah pertama adalah "Standard" dan setengah kedua adalah "Deluxe"
    for (int i = 0; i<totalRooms; i++){
        if (i < numberOfStandardRooms){
            rooms[i] = new Room(i+1, "Standard");
        } else {
            rooms[i] = new Room(i+1, "Deluxe");
        }
    }
    System.out.println("Constructor Hotel with name " + name + ", " + numberOfStandardRooms + " Standard rooms, and " + numberOfDeluxeRooms + " Deluxe rooms is called"); 
}

public String getHotelname(){
    return name;
}

}



