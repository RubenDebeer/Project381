package Delicious_Catering.Business_Logic_Layer;

public abstract class Client 
{
    private String fname;
    private String lname;
    private String phonenumber;
    private int eventnb;
    private int bookingnb;

    public Client(String fname, String lname, String phonenumber, int eventnb, int bookingnb)
    {
        this.fname = fname;
        this.lname = lname;
        this.phonenumber = phonenumber;
        this.eventnb = eventnb;
        this.bookingnb = bookingnb;
    }

    public String getFirstname()
    {
        return fname;
    }

    public String getLastname() 
    {
        return lname;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }

    public Integer getEventnb() 
    {
        return eventnb;
    }

    public Integer getBookingnb() 
    {
        return bookingnb;
    }

}
