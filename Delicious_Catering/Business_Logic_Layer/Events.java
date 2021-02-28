package Delicious_Catering.Business_Logic_Layer;

import java.security.PublicKey;

import java.sql.Date;

import javax.swing.ButtonModel;

public class Events {
    //Fields 
    private String Type;
    private String Theme;
    private String Description;
    private String Venue_Name;
    private boolean Booking_Conformation;
    private int Number_Of_People;
    private int Number_Of_Adults;
    private int Number_Of_Kids;
    private Date Date_Time;

    //Attributes 

        //Getters
        public String GetType(){ return Type;} 
        public String GetTheme(){ return Theme;} 
        public String GetDescript(){ return Description;} 
        public String GetVenue(){ return Venue_Name;} 
        public boolean GetBooking_Conformation(){ return Booking_Conformation;} 
        public int GetNOP(){ return Number_Of_People;} 
        public int GetNOK(){ return Number_Of_Kids;}
        public int GetNOA(){ return Number_Of_Adults;} 
        public Date GetDate(){ return Date_Time;} 
     
        //Setters
        public void SetType(String type){ this.Type = type;}
        public void SetTheme(String theme){ this.Theme = theme;}
        public void setDescript(String description){ this.Description = description;}
        public void SetVname(String venue_name){ this.Venue_Name = venue_name;}
        public void setBCom(Boolean BCom){ this.Booking_Conformation = BCom;}
        public void setNOP(int Nop){ this.Number_Of_People = Nop;}
        public void setNOK(int Nok){ this.Number_Of_Kids = Nok;}
        public void setNOA(int Noa){ this.Number_Of_Adults = Noa;}
        public void setDT(Date Event_Date){ this.Date_Time = Event_Date;}
      
    //Constructors 

    //Default 
    public Events(){}

    ///Methods 

    public void CheckConformation(Date date){

    }

    public void GetPrice_and_Quantity(){

    }
}//Event_Class_Update3
