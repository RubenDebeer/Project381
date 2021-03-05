import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("Enter the type of the event");

        System.out.println("Ente the theme of the event");
        
        //get Venue details

        System.out.println("Please enter the Venue Name");
        System.out.println("");


        System.out.println("'Enter the Date of the event ");
        System.out.println("'Enter the Time of the event ");

        System.out.println("Would you like Decorations Yes/No ");

        option = sc.nextLine();

        if (option.toUpperCase().equals("YES"))
        {
            System.out.println("Please give a short description of the decorations you would like");
            String Descriotion = sc.nextLine();
            
        }else
        {
            System.out.println("No decrations will be added");
        }




        //If no ask menu information from the client 

        //Create enum adult menu 
        //Create enum kids menu 

        //after menue choice  ask for the amount of Adults 

        //ask for the amount of kids 



        //Show price  of event including discount 


        //Create the booking 


        //Display the booking number 
        //Create a booking number list in the booking class

        //Add booking number to the Booking number list 

        





        





        



    }
}