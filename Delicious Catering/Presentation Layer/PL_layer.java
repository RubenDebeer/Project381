import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Date;

import javax.print.DocFlavor.STRING;

/** 
 * PL_layer
 */
public class PL_layer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Welcome to Delicious-Catering");
        System.out.println("==============================");
        System.out.println("\n");

        System.out.println("Are you a Existing Customer Yes/No?");
        

        String option = sc.nextLine();
        System.out.println("\n");

        Client  cl = new Client();


        if (option.toUpperCase().equals("YES")) {

            //Send the phone nuumber to the client for verification and print respose.  

        }else if(option.toUpperCase().equals("NO")){

            //Add new Client
            String Name;
            String Surname;
            String newcPhoneNUmber;
          
            System.out.println("Please Enter your name");
            Name = sc.nextLine();

            System.out.println("Please Enter your Surname");
            Surname = sc.nextLine();

            System.out.println("Please Enter your Phone Number");  
            newcPhoneNUmber = sc.nextLine();

            Client newcl = new Client(Name,Surname,newcPhoneNUmber);

            cl.AddCLient(newcl);

            System.out.println(Name + " "+ Surname+ " "+"We have added you to our list of clients");

        }else if(option.toUpperCase().equals("RAHEAL")){

            cl.DisplayCLients();

        }

        //Event information is gathered here

        String EType;
        System.out.println("\n");
        System.out.println("Enter the type of the event");
        EType = sc.nextLine();
        
        String ETheme;
        System.out.println("\n");
        System.out.println("Ente the theme of the event");
        ETheme = sc.nextLine();
        
        //Venue Details

        String vName;
        System.out.println("\n");
        System.out.println("Please enter the Venue Name");
        vName = sc.nextLine();

        // V Address 
        String Address;
        System.out.println("\n");
        System.out.println("Please enter the Venue Address");
        Address = sc.nextLine();

        // Phone number 
        String VPN;
        System.out.println("\n");
        System.out.println("Please enter the Venue TelePhone Number");
        VPN= sc.nextLine();

        // Manager Name
        String VMName = "";
        System.out.println("\n");
        System.out.println("Please enter the Venue Manager Name");
        VPN= sc.nextLine();

        //Instantiate venu object 
        Venue vn = new Venue(vName, Address, VMName, VPN);


        String EDate;
        System.out.println("\n");
        System.out.println("'Enter the Date of the event ");
        EDate = sc.nextLine();

        String ETime;
        System.out.println("\n");
        System.out.println("'Enter the Time of the event ");
        ETime = sc.nextLine();

        System.out.println("\n");
        System.out.println("Would you like Decorations Yes/No ");
        option = sc.nextLine();
        System.out.println("\n");

        String EDecoration = "none" ;

        if (option.toUpperCase().equals("YES"))
        {
            System.out.println("Please give a short description of the decorations you would like");
            EDecoration = sc.nextLine();

            System.out.println("Decorations added");
            
        }else
        {
            System.out.println("No decrations will be added");
        }

        System.out.println("\n");
        //If no ask menu information from the client 
        System.out.println("Please Choose a Option for the Adult Starter Menu ");

            for (int i = 0; i < AdultStarter.values().length; i++) {

            System.out.println(AdultStarter.values()[i]);
            
            }
        
            String AdultStarterOption = sc.nextLine();
            System.out.println("===========================================");
            System.out.println("Option Logged");
            System.out.println("===========================================");
            System.out.println("\n");


        System.out.println("Please Choose a Option for the Adult Main Menu ");


            for (int i = 0; i < AdultMenu.values().length; i++) {

            System.out.println(AdultMenu.values()[i]);
            
            }
            String AdultMainMenuOption  = sc.nextLine();
            System.out.println("===========================================");
            System.out.println("Option Logged");
            System.out.println("===========================================");
            System.out.println("\n");


        System.out.println("Please Choose a Option for the Adult Desert Menu ");
            for (int i = 0; i < AdultDeserts.values().length; i++) {

            System.out.println(AdultDeserts.values()[i]);
            
            }
            String AdultDersertMenuOption  = sc.nextLine();
            System.out.println("===========================================");
            System.out.println("Option Logged");
            System.out.println("===========================================");
            System.out.println("\n");


        System.out.println("Please Cho0se the Kids Starter Meal Menu Option");
            for (int i = 0; i < KidsStarter.values().length; i++) {

            System.out.println(KidsStarter.values()[i]);
            
            }   
            String KidsStarterMenuOption = sc.nextLine();
            System.out.println("===========================================");
            System.out.println("Option Logged");
            System.out.println("===========================================");
            System.out.println("\n");


 
        System.out.println("Please Cho0se the Kids Main Meal Option");
            for (int i = 0; i < kidsMenu.values().length; i++) {

            System.out.println(kidsMenu.values()[i]);
           
           }   

        String KidsMainMealMenuOption = sc.nextLine();
        System.out.println("===========================================");
        System.out.println("Option Logged");
        System.out.println("===========================================");
        System.out.println("\n");


        System.out.println("Please Chose the KIds Desert Menu Option");
            for (int i = 0; i < KidsDesert.values().length; i++) {

            System.out.println(KidsDesert.values()[i]);
           
           }   
            String KidsDersertMEnuOption = sc.nextLine();
            System.out.println("===========================================");
            System.out.println("Option Logged");
            System.out.println("===========================================");
            System.out.println("\n");

        //after menue choice  ask for the amount of Adults 
        System.out.println("\n");
        int number_of_Adults ;
        System.out.println("Please Enter the Number of Adults attending");
        number_of_Adults = sc.nextInt();


        System.out.println("\n");
        int Number_Of_Kids;
        System.out.println("Please Enter the Number of KIds attending");
        Number_Of_Kids = sc.nextInt();

        //Send the relevant information to the events Class

        Events E = new Events();

        E.SetType(EType);
        E.SetTheme(ETheme);
        E.setDecortion(EDecoration);
        E.SetVname(vName);
       
        E.setNOA(number_of_Adults);
        E.setNOK(Number_Of_Kids);
        E.setDT(EDate);
        E.setTime(ETime);

        //Send the relevant information to the Cost class
        Event_Cost EC = new Event_Cost();
        EC.kids_Cost(Number_Of_Kids, KidsStarterMenuOption, KidsMainMealMenuOption, KidsDersertMEnuOption);
        
        EC.Adult_cost(number_of_Adults, KidsStarterMenuOption, KidsMainMealMenuOption, KidsDersertMEnuOption);

        //Show price  of event including discount 

        double TotalCost;
        System.out.println("\n");
        TotalCost  = EC.getCost();
        System.out.println("Total Menu Cost: "+ TotalCost);
        System.out.println("\n");
        
        //Ask pay now 

        System.out.println("==============================================");
        System.out.println("Payment Options");
        System.out.println("==============================================");

        System.out.println("1). Pay in Full");
        System.out.println("2). Pay 50% Deposit");
        System.out.println("3). Abort");

        int PaymentOption = sc.nextInt();
        Bookings B = new Bookings();

        if (PaymentOption == 1) {
            TotalCost = 0;
            E.setCost(TotalCost);
            System.out.println("Your booking number will be ......");
            System.out.println(B.CreatBooking());
            B.setBConformation("Yes");
            E.setBCom(B.getBConformation()); 

        }else if (PaymentOption == 2) {
            //Crate a booking numer 
            TotalCost = TotalCost-(TotalCost*0.50);
            E.setCost(TotalCost);
            System.out.println("Your booking number will be ......");
            System.out.println(B.CreatBooking());
            B.setBConformation("Yes");
            E.setBCom(B.getBConformation()); 

        }else{
            System.out.println("Thank you for considering Delicious-Catering ");
            B.setBConformation("NO");
        }
    }
}