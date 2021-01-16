package homeworks;

import java.util.Scanner;

public class TradingApp2 {
    //HW -> #2
    //     * give customers option to see price for gallon and liters in case of oil
    //     * give customers option to see price for killogram, gram, and ton for GOLD, SILVER, COPPER.
    //     * ask how much do they want to buy
    //     *
    //     *   *  ex:
    //     *      * What product would you like to buy?
    //     *      * OIL
    //     *      * Which measurement would you like to use?
    //     *      * liters
    //     *      * How many liters you want to buy?
    //     *      * 2
    //     *      * output:
    //     *      * $0.78 is your total for this transaction.
    //     *      *
    //     * @param args
    //     */
    //    public static void main(String[] args) {
    //
    //    }
    //}
    //Collapse

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
                System.out.println("How many "+ measure +"'s would you want to buy?");
                double quantity = sc.nextDouble();
                switch (measure.toUpperCase()) {
                    case "GALLON":
                        price = 1.6;
                        break;
                    case "LITER":
                        price = 0.42;
                        break;
                    default:
                        System.err.println("Wrong input");
                }
                System.out.println("The price for " + quantity +" " + measure +" will be: $"+ price*quantity);

                break;

            case "GOLD":
                System.out.println("What measure would you like to choose? (gram, kilogram or ton)");
                String measureGSC = sc.nextLine();
                System.out.println("How many "+ measureGSC +"'s would you want to buy?");
                double quantityGSC = sc.nextDouble();
                switch (measureGSC.toUpperCase()) {
                    case "GRAM":
                        price = 59.68;
                        break;
                    case "KILOGRAM":
                        price = 59_681.43;
                        break;
                    case "TON":
                        price = 59_681_430.00;
                        break;
                    default:
                        System.err.println("Wrong input");
                }
                System.out.println("The price for " + quantityGSC +" " + measureGSC +" will be: $"+ price*quantityGSC);
                break;
            case "SILVER":
                System.out.println("What measure would you like to choose? (gram, kilogram or ton)");
                measureGSC = sc.nextLine();
                System.out.println("How many "+ measureGSC +"'s would you want to buy?");
                quantityGSC = sc.nextDouble();
                switch (measureGSC.toUpperCase()) {
                    case "GRAM":
                        price = 0.79;
                        break;
                    case "KILOGRAM":
                        price = 787.05;
                        break;
                    case "TON":
                        price = 787050.00;
                        break;
                    default:
                        System.err.println("Wrong input");
                }
                System.out.println("The price for " + quantityGSC +" " + measureGSC +" will be: $"+ price*quantityGSC);
                break;
            case "COOPER":
                System.out.println("What measure would you like to choose? (gram, kilogram or ton)");
                measureGSC = sc.nextLine();
                System.out.println("How many "+ measureGSC +"'s would you want to buy?");
                quantityGSC = sc.nextDouble();
                switch (measureGSC.toUpperCase()) {
                    case "GRAM":
                        price = 0.74;
                        break;
                    case "KILOGRAM":
                        price = 7.44;
                        break;
                    case "TON":
                        price = 7440.00;
                        break;
                    default:
                        System.err.println("Wrong input");
                }
                System.out.println("The price for " + quantityGSC +" " + measureGSC +" will be: $"+ price*quantityGSC);
                break;
            default:
                System.err.println("Wrong input");
        }
    }
}

