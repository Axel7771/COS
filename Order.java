public class Order {

    private String catolog;
    private String prod_name, desc;
    private double reg_price, sale_price;
    private int quant;

    
    public Order(String prod, int quant, double price)
    {

        this.prod_name = prod;
        this.quant = quant;
        this.sale_price = price;


    }


    
}
