public abstract class Menu_Cost {
    
    protected  int Quantity;
    protected  double CPP;
    protected  double Cost;


    public abstract double CalculatMenuCost( int Quant ,String Option);
    public abstract double CalculatStarterMenuCost( int Quant ,String Option);
    public abstract double CalculatDesertMenuCost( int Quant ,String Option);


}
