public class Kids_Menu_Cost extends Menu_Cost{

    
    @Override
    public double CalculatMenuCost(int Quantity, String option){


        switch (option) {

            case "Pork":
                this.CPP = 50.00;
                break;
            case "Mutton":
                this.CPP = 52.00;
                break;
            case "Beef":
                this.CPP = 56.00;
            break;

            case "Vegan":
                this.CPP = 53.00;
            break;
    
        }//end of switch 
        this.Cost = Quantity* this.CPP;
        return this.Cost;
    }

    @Override 
    public double CalculatStarterMenuCost(int Quantity, String option){

        switch (option) {

            case "Chicken Fingers":
                this.CPP = 50.00;
                break;

            case "Fish Fingers":
                this.CPP = 52.00;
                break;

            case "Burger Bites":
                this.CPP = 56.00;
            break;

            case "Chicken Nuggets":
                this.CPP = 53.00;
            break;
    
        }//end of switch 
        this.Cost = Quantity* this.CPP;

        return this.Cost;
    }

    @Override 
    public double CalculatDesertMenuCost(int Quantity, String option){

        switch (option) {

            case "Ice Cream":
                this.CPP = 50.00;
                break;

            case "Chocolate Cake":
                this.CPP = 52.00;
                break;

            case "Red Velvet Cake":
                this.CPP = 56.00;
            break;

            case "Candy":
                this.CPP = 53.00;
            break;
    
        }//end of switch 

        this.Cost = Quantity* this.CPP;

        return this.Cost;
    }

}
