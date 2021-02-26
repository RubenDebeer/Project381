package Delicious_Catering.Business_Logic_Layer;

import java.security.PublicKey;
import java.util.jar.Attributes.Name;

public class Client {

    //Fields encapsulated in the Client Class
    private String Name;
    private String SurName;
    private String Phone_Number;
    private int Booking_Number;

    //Attributes 
        //Getters 
        public String GetName(){ return Name;}
        public String GetSurname(){return SurName;}
        public String GetPhoneNUm(){return Phone_Number;}
        public int GetookingNumber(){return Booking_Number;}

        //Setters 
        public void SetName(String name){ this.Name = name;}
        public void SetSurName(String surname){ this.SurName = surname;}
        public void SetPhone_Number(String phone_number){ this.Phone_Number = phone_number;}
        public void SetBookin_Number(int Book_Num){ this.Booking_Number = Book_Num;}
 
    //Constrctors 
        //Default
        public Client(){}

}
//Client_Class_Update3
