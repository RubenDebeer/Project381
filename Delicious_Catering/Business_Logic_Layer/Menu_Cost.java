package Delicious_Catering.Business_Logic_Layer;

public class Menu_Cost extends Abstarct_Cost {

    public  double Calculate_Cost(){
        return(Quantity * Price);
    }

    public void Menu_Cost(int quantity,double price,){
        this.Quantity = quantity;
        this.Price = price;
    }

}
