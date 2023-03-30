import javax.swing.*;

public class ProductClass {

    //private variables
    private String description;
    private double price;


    //Non-default constructor
    public ProductClass(String description, double price){
        this.description = description;
        this.price = price;
    }

    //getter and setter for description
    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    //getter and setter for price
    public double getPrice(){return price;}
    public void setPrice(double price) {this.price = price;}


}
