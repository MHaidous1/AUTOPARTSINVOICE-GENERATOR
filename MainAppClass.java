import java.util.Scanner;

public class MainAppClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carPart;

        AddressClass address = new AddressClass("Moe's Auto Parts~", "123 Oak Street", "Dearborn", "MI", 48126);
        InvoiceClass invoice = new InvoiceClass(address);


        System.out.println("\t\t\t\tInvoice");
        System.out.println(address);

        //  adds new products for the user to enter
        System.out.print("Enter total number of products you'd like to add : ");
        int n = input.nextInt();
        input.nextLine();

        //loop to go through products
        for(int x = 0; x < n; x++) {

            System.out.println("\nEnter  product # " + (x + 1) + ": ");

            // get the description from user
            System.out.print("\nEnter product description: ");
            String productDescription = input.nextLine();

            // gets the price from user
            System.out.print("Enter Product Price : ");
            Double productPrice = input.nextDouble();

            // gets amount of products from user
            System.out.print("Enter Product Quantity : ");
            int productQuantity = input.nextInt();

            //  object of product
            ProductClass product = new ProductClass(productDescription, productPrice);

            // object Of Line Item to store user input form above
            LineItemClass lineItem = new LineItemClass(productQuantity, product);

            //  adds each product into the invoice class
            invoice.add(productQuantity, product);
            input.nextLine();
        }

        System.out.println();
        invoice.printData();//prints invoice from the printData() method from InvoiceClass


    }
}
