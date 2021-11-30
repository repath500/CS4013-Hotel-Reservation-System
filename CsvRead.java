import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvRead {
    private String[][] hotelInfo;

    // Reads the l4Hotels csv file and places it into a 2D array
    public String[][] getHotelData() throws FileNotFoundException{
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
}
