import java.text.DecimalFormat;
import java.util.ArrayList;

public class InvoiceClass {

    //sets array object of line items
    private final ArrayList<LineItemClass> lineItem = new ArrayList<>();
    private final AddressClass address;

    //Non-default Constructor
    public InvoiceClass(AddressClass address){this.address = address;}

    //method creates new line items to be added to the line item array
    public void add(int quantity, ProductClass product ) {
        LineItemClass oneLine = new LineItemClass(quantity,product);
        boolean add = lineItem.add(oneLine);
    }

    //gets total amount of all line items
    public double getAmountDue(){
        double total = 0;

        for (LineItemClass oneLineItem: lineItem)
            total += oneLineItem.calcTotalPrice();

        return total;
    }


    //displays invoice which is called in the MainAppClass
    public void printData() {

        System.out.println("\t\tInvoice");
        System.out.println(address);

        DecimalFormat format = new DecimalFormat("$ 0.00");//function to round prices


        for (int x = 0; x < lineItem.size(); x++) {

            System.out.print("\t" + lineItem.get(x).getQuantity() + "\t");
            System.out.print("\t" + lineItem.get(x).product().getDescription() + "\t");
            System.out.print("\t" + (format.format(lineItem.get(x).product().getPrice()) + "\t"));
            System.out.println("\t\t"+(format.format(lineItem.get(x).calcTotalPrice())));
            System.out.println();
        }
            System.out.println("Total Amount Due:\t"+(format.format(getAmountDue())));

    }
}
