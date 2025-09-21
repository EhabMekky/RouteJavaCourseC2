package dayThree;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        //get the of items
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int quantity = s.nextInt();
        double total = 0;

        for(int i=0; i<quantity;i++) // i will loop till reach 6
        {
            System.out.println("Enter the cost of the item: "); //5 loops
            double price = s.nextDouble();
            total += price; //total = total + price; // shorthand operator
        }
        System.out.println("The total price is: " + total);
    }
}
