import java.time.LocalDateTime;

public class Reservation {
    private int reservationNumber;
    private String reservationName;
    private String reservationType;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private int numberRooms;
    private String roomType;
    private int occupancy;
    private double totalCost;

    public Reservation(){
        reservationNumber = 000000000;
        reservationName = "John";
        reservationType = "S";
        checkIn = LocalDateTime.now();
        checkOut = LocalDateTime.now();
        numberRooms = 2;
        roomType = "Deluxe Double";
        occupancy = 4;
        totalCost = 100;
    }
    //Mutators
    public void setReservationNumber(int number){
        this.reservationNumber = number;
    }

    public void setReservationName(String name){
        this.reservationName = name;
    }

    public void setReservationType(String type){
        this.reservationType = type;
    }

    public void setCheckIn(LocalDateTime checkIn){
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDateTime checkOut){
        this.checkOut = checkOut;
    }

    public void setNumberRooms(int number){
        this.numberRooms = number;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public void setOccupancy(int number){
        this.occupancy = number;
    }

    public void setTotalCost(double cost){
        this.totalCost = cost;
    }
    //Accessors
    public String getReservationName(){
        return reservationName;
    }

    public int getReservationNumber(){
        return reservationNumber;
    }

    public String getReservationType(){
        return reservationType;
    }

    public LocalDateTime getCheckIn(){
        return checkIn;
    }

    public LocalDateTime getCheckOut(){
        return checkOut;
    }

    public int getNumberRooms(){
        return numberRooms;
    }

    public String getRoomType(){
        return roomType;
    }

    public int getOccupancy(){
        return occupancy;
    }

    public double getTotalCost(){
        return totalCost;
    }
}
