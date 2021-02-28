package Delicious_Catering.Business_Logic_Layer;

public abstract class Abstract_Menu {

    protected String Main_meal_options;
    protected String Deser_options;
    protected String starter_option;
    protected String Drinks;
    protected int Number_op_people;
    protected float Cost_Per_Person;


    public abstract String Send_Menue_Selection();
}
