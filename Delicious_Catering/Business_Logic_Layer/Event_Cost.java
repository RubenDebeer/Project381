package Delicious_Catering.Business_Logic_Layer;

import java.lang.ProcessBuilder.Redirect.Type;


public class Event_Cost extends Abstarct_Cost {

    public  double Calculate_Cost(){
        return(Quantity * Price);
    }

    //Set te fields //Consstructer
    public void Event_Cost(int quantity,double price){
        this.Quantity = quantity;
        this.Price = price;
    } 
}