package Delicious_Catering;

import java.security.PublicKey;
import java.util.jar.Attributes.Name;
import java.util.*;

public class Client {

    //Fields encapsulated in the Client Class
    private String Name;
    private String SurName;
    private String Phone_Number;
    

    private List<Client> ClientList = new ArrayList<Client>();

    //Attributes 
        //Getters 
        public String GetName(){ return Name;}
        public String GetSurname(){return SurName;}
        public String GetPhoneNUm(){return Phone_Number;}

        //Setters 
        public void SetName(String name){ this.Name = name;}
        public void SetSurName(String surname){ this.SurName = surname;}
        public void SetPhone_Number(String phone_number){ this.Phone_Number = phone_number;}
      
 
    //Constrctors 
        //Default
        public Client(){

        }

        public Client(String Name , String SName, String PN)
        {
            this.Name = Name;
            this.SurName = SName;
            this.Phone_Number = PN;
        }

        public void AddCLient(Client NewClient)
        {

            ClientList.add(NewClient);

        }

        public boolean CheckClienlist(String PhoneNumber)
        {
            boolean result = false;

            for (Client client : ClientList) {

                if (client.GetPhoneNUm().equals(PhoneNumber)) {
                    return true;
                }
            }

            return result;
        }
}
//Client_Class_Update3
