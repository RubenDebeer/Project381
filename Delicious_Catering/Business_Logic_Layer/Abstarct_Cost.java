package Delicious_Catering.Business_Logic_Layer;

public abstract class Abstarct_Cost {

    protected String Type;
    protected double Price;
    protected int Quantity;

    public abstract double Calculate_Cost();

    
}
