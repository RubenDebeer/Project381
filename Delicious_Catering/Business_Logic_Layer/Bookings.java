package Delicious_Catering.Business_Logic_Layer;

import java.lang.reflect.Method;

public class Bookings implements ISend {

    private int Booking_Number; 
    private String Booking_Conformation;
    private String Menu_Selection;


    //Get 
    public int GetNumber(){ return Booking_Number;} 
    public String GetBConfor(){ return Booking_Conformation;} 
    public String GetMeue(){ return Menu_Selection;}
 


    //Set 
    public void SetType(int BNumber){ this.Booking_Number = BNumber;}
    public void SetType(String Confor){ this.Booking_Conformation = Confor;}
    public void SetMenue(String Menue) {this.Menu_Selection = Menue;}
    
    public boolean Checkdate(){

        boolean Date_Check;

        //Check if the date is available in a array full of dates and then send conformation if venue name and booking date is avilable

        return true;
    }

    public String sendInfor(){
        return  Booking_Conformation;
    }

}
