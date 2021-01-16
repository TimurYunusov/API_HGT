package input_from_user;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashierProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item: ");
        String item = sc.nextLine();

        System.out.println("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Enter amount: ");
        int amount = sc.nextInt();

        double total = amount*price;
        double tax = total * 12/100;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Total before taxes:  $" + (decimalFormat.format(total)) + "\n"+"State tax:  \t \t $"+ (decimalFormat.format(tax)) + "\n" + "Total:    \t\t     $" + decimalFormat.format(total+tax) );





    }
}
