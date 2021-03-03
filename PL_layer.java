import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * PL_layer
 */
public class PL_layer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Client> NewMemberList = new ArrayList<Client>();

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

            //Call the check if exixst class and give the appropriate output
            //

            cl.DisplayCLients();

            //
            //
        
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

            NewMemberList.add(newcl); 
            cl.AddCLient(NewMemberList);
            
            cl.DisplayCLients();
            
        }

        
    }
}