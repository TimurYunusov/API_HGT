package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RevenueCalc {
    public static void main(String[] args) {
        //Exercise 2: Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user.
        //The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units.
        // If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:
        //Enter unit price: 25
        //
        //Enter quantity: 110
        //
        //The revenue from sale: 2475.0$
        //
        //After discount: 275.0$(10.0%)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        double discount = 0;
        String discountForOutput = "";
        if(quantity>120){
            discount=1.15;
            discountForOutput = "(15%)";
        }else if(quantity>100 && quantity<=120){
            discount=1.1;
            discountForOutput="(10%)";
        } else {
            discount=1;
            discountForOutput=" (no discount)";
        }
        DecimalFormat df =new DecimalFormat(".00");
        double discountMoney= (quantity*unitPrice*discount)-(quantity*unitPrice);
        System.out.println("The revenue from sale: " + df.format((quantity*unitPrice)-discountMoney) +"$" );
        System.out.println("After discount " + df.format(discountMoney)+"$" + discountForOutput);
    }
}
