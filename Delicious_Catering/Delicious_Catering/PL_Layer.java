package Delicious_Catering;

import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class PL_Layer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Welcome to Delicious-Catering");
        System.out.println("==============================");

        System.out.println("Are you a Existing Customer Yes/No?");

        String option = sc.nextLine();

        Client  cl = new Client();

        if (option.toUpperCase().equals("YES")) {

            String PhoneNUmber;

            System.out.println("Enter your Phone number");
            PhoneNUmber = sc.nextLine();

            boolean found = cl.CheckClienlist(PhoneNUmber);

            if (found == true) {

                System.out.printf("Welcome ", cl.GetName() + cl.GetSurname());
            }
            
        }else{

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

            cl.AddCLient(cl);
            
        }

    }
}
