package Delicious_Catering.Business_Logic_Layer;

public class Bookings extends Client
{
    private boolean status;

    public Bookings(String fname, String lname, String phonenumber, int eventnb, int bookingnb, boolean status) 
    {
        super(fname, lname, phonenumber, eventnb, bookingnb);
        setStatus(status);
    }

    private void setStatus(boolean status) 
    {
        
    }


}
