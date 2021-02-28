package Delicious_Catering.Business_Logic_Layer;

public class Kids_menu extends Abstract_Menu {
    public void Get_Selection(String Desert_Option,String Drink_Option, String Sarter_option, String Main_Option){
   
        this.Main_meal_options = Main_Option;
        this.Deser_options = Desert_Option;
        this.Drinks = Drink_Option;
        this.starter_option = Sarter_option;
    }
        
    public String Send_Menue_Selection(){
        return this.Main_meal_options;
    }
}
