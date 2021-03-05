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

        System.out.println("Are you a Existing Customer Yes/No?");

        String option = sc.nextLine();

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

            System.out.println("Please Enter your phone number");  
            newcPhoneNUmber = sc.nextLine();

            Client newcl = new Client(Name,Surname,newcPhoneNUmber);

            cl.AddCLient(newcl);

            System.out.println(Name + " "+ Surname+ " "+"We have added you to our list of clients");

        }else if(option.toUpperCase().equals("RAHEAL")){

            cl.DisplayCLients();

        }

        //Event information is gathered here

        String type;
        System.out.println("Enter the type of the event");
        type = sc.nextLine();
        
        String theme;
        System.out.println("Ente the theme of the event");
        theme =sc.nextLine();
        
        //get Venue details

        String vName;
        System.out.println("Please enter the Venue Name");
        vName = sc.nextLine();

        String EDate;
        System.out.println("'Enter the Date of the event ");
        EDate = sc.nextLine();

        String ETime;
        System.out.println("'Enter the Time of the event ");
        ETime = sc.nextLine();

        System.out.println("Would you like Decorations Yes/No ");

        option = sc.nextLine();

        if (option.toUpperCase().equals("YES"))
        {
            System.out.println("Please give a short description of the decorations you would like");
            String Descriotion = sc.nextLine();

            System.out.println("Decorations added");
            
        }else
        {
            System.out.println("No decrations will be added");
        }




        //If no ask menu information from the client 
        System.out.println("Please Choose a Option for the Adult Starter Menu ");
        String AdultStarterOption = sc.nextLine();
         
        System.out.println("Please Choose the Adult Main Meal Menu Option");
        String AdultMainMenuOption  = sc.nextLine();

        System.out.println("Please Choose a Option for the Adult Desert Menu ");
        String AdultDersertMenuOption  = sc.nextLine();

        
        System.out.println("Please Chose the KIds Starter Meal Menu Option");
        String KidsStarterMenuOption = sc.nextLine();

 
        System.out.println("Please Chose the KIds Main Meal Option");
        String KidsMainMealMenuOption = sc.nextLine();


        System.out.println("Please Chose the KIds Desert Menu Option");
        String KidsDersertMEnuOption = sc.nextLine();


        //after menue choice  ask for the amount of Adults 

        //ask for the amount of kids 



        //Show price  of event including discount 


        //Create the booking 


        //Display the booking number 
        //Create a booking number list in the booking class

        //Add booking number to the Booking number list 

        





        





        



    }
}