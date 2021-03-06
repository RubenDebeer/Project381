
public class Event_Cost {

    private double kids_cost;
    private double Adult_cost;

    //private double 

    public void kids_Cost( int Quantity, String StarterOption ,String MainOpion , String DesertOption){

        Kids_Menu_Cost km = new  Kids_Menu_Cost();
       
        this.kids_cost = this.kids_cost + km.CalculatMenuCost(Quantity, MainOpion);

        this.kids_cost = this.kids_cost + km.CalculatStarterMenuCost(Quantity, StarterOption);

        this.kids_cost = this.kids_cost + km.CalculatDesertMenuCost(Quantity, DesertOption);
    }

    public void Adult_cost( int Quantity, String StarterOption ,String MainOpion , String DesertOption){

        Adult_Menu_Cost am = new Adult_Menu_Cost();

        this.kids_cost = this.kids_cost + am.CalculatMenuCost(Quantity, MainOpion);

        this.kids_cost = this.kids_cost + am.CalculatStarterMenuCost(Quantity, StarterOption);

        this.kids_cost = this.kids_cost + am.CalculatDesertMenuCost(Quantity, DesertOption);

        if (Quantity >= 40 ) {

            double discount ;

            discount = this.kids_cost*0.15;

            this.kids_cost = this.kids_cost-discount;
        }
    }

    public double getCost() {

        double Event_Cost = this.kids_cost + this.Adult_cost;

        return Event_Cost;
    }

}
