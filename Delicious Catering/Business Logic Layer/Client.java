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
        public Client()
        {
           
        }

        public Client(String Name , String SName, String PN)
        {
            this.Name = Name;
            this.SurName = SName;
            this.Phone_Number = PN;
        }
        //Add new client object to the list
        public void AddCLient(Client newClient)
        {
            ClientList.add(newClient);
        }

        //Display the Clients
        public void DisplayCLients(){

            for(Client client : ClientList) {

                System.out.println(client.GetName()+" "+client.GetSurname()+ " "+client.GetPhoneNUm());
            }
        }

        public void CheckClient(String PhoneNum){

            for (Client client : ClientList) {

                if (client.Phone_Number == PhoneNum) {

                    System.out.println("Found it ");
                             
                }else continue;  
            }
        }
}
