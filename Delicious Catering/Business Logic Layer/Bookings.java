import java.util.Random;
import java.util.Set;
public class Bookings {
    

    private String Bookig_Number;
    private String BConformation;

    public String getBConformation() {return BConformation;}

    public String getBookig_Number() {return Bookig_Number;}


    public void setBConformation(String bConformation) {BConformation = bConformation;}

    public String CreatBooking(){

        Random rand = new Random();

        int i = rand.nextInt(100);
        
        this.Bookig_Number = "A_B_D_CL134546345_"+i;
        return Bookig_Number;
    }

}
 