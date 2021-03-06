import java.io.FileWriter;
import java.io.IOException;

public class Venue_File_Handler {

    public void Venue(String Name, String Address, String Manager_Name, String Manager_PN) 
    {
        try 
        {
            FileWriter eventFileHandler = new FileWriter("Venue.txt");

            eventFileHandler.write(Name + "," + Address + "," + Manager_Name + "," + Manager_PN);
            eventFileHandler.close();

            System.out.println("Successfully wrote to file.");

        } catch (IOException e) {
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
}


