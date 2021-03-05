
import java.sql.Date;
import java.util.Set;

public class Events {
    //Fields 
    private String Type;
    private String Theme;
    private String Decoration;
    private String Venue_Name;
    private String Booking_Conformation;
    private int Number_Of_Adults;
    private int Number_Of_Kids;
    private String Date_Time;
    private String Time;
    private double Cost;

    //Attributes 

        //Getters
        public String GetType(){ return Type;} 
        public String GetTheme(){ return Theme;} 
        public String getDecoration(){ return Decoration;} 
        public String GetVenue(){ return Venue_Name;} 
        public String GetBooking_Conformation(){ return Booking_Conformation;} 
        public int GetNOK(){ return Number_Of_Kids;} 
        public int GetNOA(){ return Number_Of_Adults;} 
        public String GetDate(){ return Date_Time;} 
        public String getTime() { return Time;}
        public double getCost() {return Cost; }
     
        //Setters aka Constructers
        public void SetType(String type){ this.Type = type;}
        public void SetTheme(String theme){ this.Theme = theme;}
        public void setDecortion(String decoration){ this.Decoration = decoration;}
        public void SetVname(String venue_name){ this.Venue_Name = venue_name;}
        public void setBCom(String BCom){ this.Booking_Conformation = BCom;}
        public void setNOK(int Nok){ this.Number_Of_Kids = Nok;}
        public void setNOA(int Noa){ this.Number_Of_Adults = Noa;}
        public void setDT(String Event_Date){ this.Date_Time = Event_Date;}
        public void setTime(String time) {Time = time;}
        public void setCost(double cost) {Cost = cost;}
      
    //Constructors 

    //Default 
    public Events(){}

    ///Methods 

    public void CheckConformation(Date date){

    }

    public void GetPrice_and_Quantity(){

    }

    //Write a method that will display in the file handler


}//Event_Class_Update3

