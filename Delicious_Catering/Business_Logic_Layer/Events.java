package Delicious_Catering.Business_Logic_Layer;

import java.security.PublicKey;

import javax.swing.ButtonModel;

public class Events {
    //Fields 

    private String Event_Name;
    private String Event_Type;
    private String Client_Name;
    private String Client_SName;
    private int Event_Number;
    private String Decorations; 
    private int Number_Of_Adults;
    private int Number_Of_Kids;
    private int Booking_Number;
    private String ClientPN;

    //Attributes 

        //Getters 
        public String GetEventName(){
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
        public String GetCSName(){
            return Client_SName;
        }
        public String GetCPN(){ //Get the clients phone number 
            return ClientPN;
        }

        //Setters
        public void SetEName( String EName){
            this.Event_Name = EName;
        }

        public void SetEtype(String EType){
            this.Event_Type = EType;
        }

        public void SetENumber(int ENumber ){
            this.Event_Number = ENumber;
        }

        public void setCName(String CLName){
            this.Client_Name = CLName;
        }

        public void SetCSName(String CLSName ){
            this.Client_SName = CLSName;
        }

        public void SetCPN(String CLPN){
            this.ClientPN = CLPN;
        }

        public void SetKidNum(int KidNum){
            this.Number_Of_Kids = KidNum;
        }

        public void SetAudNum(int AudNum){
            this.Number_Of_Adults = AudNum;
        }

        public void SetBNum(int BNumber){
            this.Booking_Number = BNumber;
        }

        public void SetDecorations(String Decor){
            this.Decorations = Decor;
        }

    //Constructors 

    //Default 

    //Custom 

}
