public class Room{
    private int roomNumber;
    private String roomType;
    private boolean occupied;
    private double rate;

    public Room (int roomNumber,String roomType,boolean occupied,double rate){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
        System.out.println("Constructor Room with all parameters is called");
    }

    public Room (){
        this.roomNumber = 0;
        this.roomType = "Standard" ;
        this.occupied = false;
        this.rate = 100.0; 
        System.out.println("Default constructor Room is called");
    }

    public Room (int roomNumber,String roomType){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = false;
        if (this.roomType == "Standard"){
            this.rate = 100.0;
        } else if (this.roomType == "Deluxe"){
            this.rate = 200.0;
        } else {
            return;
        }
        System.out.println("Constructor Room with roomNumber " + roomNumber + " and roomType " + roomType + " with rate " + this.rate + "is called");
    }

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

}