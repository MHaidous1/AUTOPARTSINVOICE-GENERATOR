public class LineItemClass {

    //Private variables
    private int quantity;
    private ProductClass product;

    //Non-default constructor
    public LineItemClass(int quantity, ProductClass product){
        this.product = product;
        this.quantity = quantity;
    }

    //sets product class to public so variables within it could be accessed
    public ProductClass product(){return product;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){ this.quantity = quantity;}


    //Calculates total price and returns it
    public double calcTotalPrice(){
        double totalPrice = this.quantity * product.getPrice();
        return totalPrice;
    }


}
