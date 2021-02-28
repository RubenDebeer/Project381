package Delicious_Catering.Business_Logic_Layer;

public class Menu_Cost extends Abstarct_Cost {

    public double Discount_Amount;

    public double GetDiscount(){ return Discount_Amount;} 
    public void SetDiscount(Double Discount){ this.Discount_Amount = Discount;}

    public  double Calculate_Cost(){
        return(Quantity * Price);
    }

    public void Menu_Cost(int quantity,double price){
        this.Quantity = quantity;
        this.Price = price;
    }

    //Get the mnue selection 
    //Get the price list in rray 
    //Calculate 
} 
