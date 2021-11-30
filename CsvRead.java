import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvRead {
    private String[][] hotelInfo;

    // Reads the l4Hotels csv file and places it into a 2D array
    public String[][] getHotelData(){
        try {
            java.io.File csvFile = new java.io.File("l4Hotels.csv");
            // Sets the csv file as the input
            Scanner input = new Scanner(csvFile);
            String line;
            this.hotelInfo = new String[12][12];
            int x = 0;
            while (input.hasNext()) {
                line = input.nextLine();
                // Separate strings with a comma
                this.hotelInfo[x] = line.split(",");
                x++;
            }
            input.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return hotelInfo;
    }
    
    // Reads in data from the reservations.csv file and places it into a 2D array
    public String[][] getReservations() {
        try {
            java.io.File csvFile = new java.io.File("reservations.csv");
            Scanner counter = new Scanner(csvFile);
            /**
             * First we create two strings, one is going to be used to count
             * the amount of rows there will be in the array.
             */
            String line;
            String x;
            int y = 0;
            while (counter.hasNext()){
                x = counter.nextLine();
                y++;
            }
            // Now we can use the y count to set the amount of rows.
            counter.close();
            Scanner input = new Scanner(csvFile);
            this.reservations = new String[y][9];
            // Then we reset the y count.
            y = 0;
            while(input.hasNext()){
                line = input.nextLine();
                this.reservations[y] = line.split(",");
                y++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reservations;
    }
}
