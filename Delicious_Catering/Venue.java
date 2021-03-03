package Delicious_Catering;

public class Venue implements ISend {
    private String VName; 
    private String VAddress;
    private int Capacity;
    private String Phone_Number;
    private String Manager_Name;

    //Get 
    public String GetName(){ return VName;} 
    public String GetAddress(){ return VAddress;} 
    public String GetPhoneNum(){ return Phone_Number;} 
    public String GetManager(){ return Manager_Name;} 
    public int GetCap(){ return Capacity;} 

    //Set 
    public void SetName(String Name){ this.VName = Name;}
    public void SetAddress(String Address){ this.VAddress = Address;}
    public void SetPhone_Number(String PN){ this.Phone_Number = PN;}
    public void SetManager_Name(String MName){ this.Manager_Name = MName;}
    public void SetCapacity(int Cap){ this.Capacity = Cap;}

    public String sendInfor(){
        return  VName;
    }
}
