package homeworks;

import java.util.Scanner;

public class TradingApp {
    /*
        package switch_statement;
    public class NestedSwitchHomework {
        /**
         * Trading application.
         *
         * Products offered are OIL, GOLD, SILVER, COPPER.
         *
         * price for oil per barrel -> $46.80
         * price for GOLD per ounce -> $1,837.50
         * price for SILVER per ounce -> $24.11
         * price for COPPER per ounce -> $3.53
         *
         *
         * Ask what the customer wants to buy.
         * HW -> #1
         * give customers option to see price for gallon and liters in case of oil
         * give customers option to see price for kilogram, gram, and ton for GOLD, SILVER, COPPER.
         *
         * ex:
         * What product would you like to buy?
         * OIL
         * Which measurement would you like to use?
         * liters
         *
         * output:
         * $0.39 per liter of crude oil.
    */
    public static void main(String[] args) {
        System.out.println("Welcome to our exchange platform! Please choose what you would like to buy:");
        System.out.println("* Oil \n *Gold \n *Silver \n *Cooper");
        Scanner sc = new Scanner(System.in);
        String commodity = sc.nextLine();
        double price = 0.0;
        switch (commodity.toUpperCase()) {
            case "OIL":
                System.out.println("What measure would you like to choose? (gallon or liter)");
                String measure = sc.nextLine();
                switch (measure.toUpperCase()) {
                    case "GALLON":
                        price = 1.6;
                        break;
                    case "LITER":
                        price = 0.42;
                        break;
                    default:
                        System.err.println("Wrong input");
                } System.out.println("The price for " + measure + " will br: $" +price );
                break;
            case "GOLD":
                System.out.println("What measure would you like to choose? (gram, kilogram or ton)");
                String measureGSC = sc.nextLine();
                switch (measureGSC.toUpperCase()) {
                    case "GRAM":
                        price=59.68;
                        break;
                    case "KILOGRAM":
                        price=59_681.43;
                        break;
                    case "TON":
                        price=59_681_430.00;
                        break;
                    default:
                        System.err.println("Wrong input");
                }  System.out.println("The price for " + measureGSC + " will be: $" +price );
                break;
            case "SILVER":
                System.out.println("What measure would you like to choose? (gram, kilogram or ton)");
                measureGSC = sc.nextLine();
                switch (measureGSC.toUpperCase()) {
                    case "GRAM":
                        price=0.79;
                        break;
                    case "KILOGRAM":
                        price=787.05;
                        break;
                    case "TON":
                        price=787050.00;
                        break;
                    default:
                        System.err.println("Wrong input");
                }  System.out.println("The price for " + measureGSC + " will be: $" +price );
                break;
            case "COOPER":
                System.out.println("What measure would you like to choose? (gram, kilogram or ton)");
                measureGSC = sc.nextLine();
                switch (measureGSC.toUpperCase()) {
                    case "GRAM":
                        price=0.74;
                        break;
                    case "KILOGRAM":
                        price=7.44;
                        break;
                    case "TON":
                        price=7440.00;
                        break;
                    default:
                        System.err.println("Wrong input");
                }  System.out.println("The price for " + measureGSC + " will be: $" +price );
                break;
            default:
                System.err.println("Wrong input");
        }
    }
}