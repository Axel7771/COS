public class Customer {


    public String ID;
    public String password;

    Customer(){

    }

    Customer(String ID, String password){
        this.ID = ID;
        this.password = password;
    }

    public void setID(String ID){

        this.ID = ID;

    }

    public String getID()
    {
        return ID;
    }



}
