package input_from_user;

import java.util.Scanner;

public class CashiersProgram {
    public static void main(String[] args) {
        //we want to ask customer description amount of an item and price.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");

        int amount = sc.nextInt();
        System.out.println("Enter price: ");

        double price = sc.nextDouble();
        System.out.println("Enter item");

        Scanner sc2 = new Scanner(System.in);
        String item = sc2.nextLine();

        System.out.println( amount + " "+ item + " " + "$" + price +"each");
        System.out.println("Total: $" + (amount*price));

    }
}
