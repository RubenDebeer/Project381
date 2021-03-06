public class Adult_Menu_Cost extends Menu_Cost
{
    @Override
    public double CalculatMenuCost(int Quantity, String option)
    {
        switch (option) 
        {
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

            case "Cheese Balls":
                this.CPP = 50.00;
                break;

            case "Chicken Satay":
                this.CPP = 52.00;
                break;

            case "Tangi Kababs":
                this.CPP = 56.00;
            break;

            case "Nachos":
                this.CPP = 53.00;
            break;
    
        }//end of switch 
        this.Cost = Quantity* this.CPP;

        return this.Cost;
    }

    @Override 
    public double CalculatDesertMenuCost(int Quantity, String option){

        switch (option) {

            case "Mint Oreo Cake":
                this.CPP = 50.00;
                break;

            case "Rasberry Brownies":
                this.CPP = 52.00;
                break;

            case "ButterFinger Cookies":
                this.CPP = 56.00;
            break;

            case "Doughnuts":
                this.CPP = 53.00;
            break;
    
        }//end of switch 

        this.Cost = Quantity* this.CPP;

        return this.Cost;
    }



    
}
