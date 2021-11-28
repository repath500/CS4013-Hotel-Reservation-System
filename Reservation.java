import java.time.LocalDateTime;

/**The Following code was authored by
 * @20251874, Farran Haley.
 */

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
    private ArrayList<Reservation> reservations;

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
    
    //Constructor
    public Reservation(String name, String reservationType, LocalDateTime checkIn, LocalDateTime checkOut,
                       int numberRooms, String roomType, int occupancy, int totalCost){
        // First we must create a random reservation number
        this.reservationNumber = (int) (Math.random() * 100000);
        this.reservationName = name;
        this.reservationType = reservationType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberRooms = numberRooms;
        this.roomType = roomType;
        this.occupancy = occupancy;
        this.totalCost = totalCost;

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
        //Cancel Reservation Method
    public ArrayList<Reservation> cancelReservation(int reservationNumber){
        LocalDateTime time = LocalDateTime.now();
        for (int i = 0; i < reservations.size(); i++){
            if(checkIn.minusDays(2) == time) {
                if (this.reservationNumber == reservationNumber) {
                    reservations.remove(i);
                }
            } else {
                if (this.reservationNumber == reservationNumber){
                    reservations.remove(i);
                    setTotalCost(0);
                }
            }
        }
        return reservations;
    }
    //ToString Method for formatting the reservations to text
       public String toString() {
        return "Reservation Number : " + reservationNumber + "\nReservation Name : " + reservationName +
                "\nReservation Type : " + reservationType + "\nCheck In : " + checkIn + "\nCheck Out : " +
                checkOut + "\nNumber of Rooms : " + numberRooms + "\nRoom Type : " + roomType +
                "\nOccupancy : " + occupancy + "\nTotal Cost : " + totalCost;
    }
    
        //Reservation Checker
    public String reservationChecker(LocalDateTime date){
        for (int i = 0; i < reservations.size(); i++){
            if (date == checkIn){
                return "Room Unavailable";
            } else if (date == checkOut){
                return "Room Unavailable";
            } else if (date.isAfter(checkIn) && date.isBefore(checkOut)){
                return "Room Unavailable";
            }
        }
        return "Room Available";
    }
}
