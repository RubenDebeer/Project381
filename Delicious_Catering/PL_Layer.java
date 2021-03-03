package Delicious_Catering;

import java.util.Scanner;

public class PL_Layer {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Welcome to Delicious-Catering");
        System.out.println("==============================");

        System.out.println("Are you a Existing Customer Yes/No?");

        String option = sc.nextLine();

        if (option.toUpperCase().equals("YES")) {


            //GET name and surname form the user  and cehk if he / she exists in the clinet object list
            
        }else{
            //Add new Client

            String Name;
            String Surname;
            String PhoneNUmber;

            System.out.println("Please Enter your name");
            Name = sc.nextLine();

            System.out.println("Please Enter your Surname");
            Surname = sc.nextLine();

            System.out.println("Please Enter your phone number");
            
            PhoneNUmber = sc.nextLine();

            Client  cl = new Client(Name,Surname,PhoneNUmber);

            cl.AddCLient(cl);


            //Add to LCient list
            
        }



        Client  cl = new Client();




        
    }
}
