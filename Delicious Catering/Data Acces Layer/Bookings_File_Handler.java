import java.io.FileWriter;
import java.io.IOException;

public class Bookings_File_Handler {

    public void Bookings(String Bookig_Number, String BConformation ) 
    {
        try {
            FileWriter eventFileHandler = new FileWriter("Bookings.txt");

            eventFileHandler.write(Bookig_Number + "," + BConformation);
            eventFileHandler.close();

            System.out.println("Successfully wrote to file.");

        } catch (IOException e) {
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }

}