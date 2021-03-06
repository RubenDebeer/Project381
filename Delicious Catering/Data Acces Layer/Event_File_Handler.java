import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;

public class Event_File_Handler {

    public void Events(String Type, String Theme, String Decoration, String Venue_Name, String Booking_Conformation, int Number_Of_Adults, int Number_Of_Kids, String Date_Time, String Time, double Cost) {
        try {
            FileWriter eventFileHandler = new FileWriter("Event.txt");

            eventFileHandler.write(Type + "," + Theme + "," + Decoration + "," + Venue_Name + "," + Booking_Conformation + "," + Number_Of_Adults + "," + Number_Of_Kids + "," + Date_Time + "," + Time + "," + Cost);
            eventFileHandler.close();

            System.out.println("Successfully wrote to file.");

        } catch (IOException e) {
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
}
