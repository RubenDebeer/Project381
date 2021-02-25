package Delicious_Catering.Business_Logic_Layer;

public class Events {
    //Fields 

    private String Event_Name;
    private String Event_Type;
    private String Client_Name;
    private int Event_Number;
    private String Decorations; 
    private int Number_Of_Adults;
    private int Number_Of_Kids;
    private int Booking_Number;

    //Attributes 

        //Getters 
        public String GetEvent(){
            return Event_Name;
        }
        public String GetEType(){
            return Event_Type;
        }
        public String GetCName(){
            return Client_Name;
        }
        public int GetENumber(){
            return Event_Number;
        }
        public String GetDecrations(){
            return Decorations;
        }
        public int GetKidNum(){
            return Number_Of_Kids;
        }
        public int GetAdNum(){
            return Number_Of_Adults;
        }
        public int GetBNum(){
            return Booking_Number;
        }

        //Setters


    //Constructors 

    //Default 

    //Custom 

    
}
