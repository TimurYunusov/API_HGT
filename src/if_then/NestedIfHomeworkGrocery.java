package if_then;

import java.util.Scanner;

public class NestedIfHomeworkGrocery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What type of product do you store? (greens, fruit or vegetable?)");
        String productType = sc.nextLine();
        System.out.println("What product are you going to store?");
        String productName = sc.nextLine();
        int daysToExpire = 0;
        String imported = "";

        if (productType.equals("Greens")) {           //this block checks if user entered type:greens
            if (productName.equals("Cilantro")) {
                daysToExpire = 10;
            } else if (productName.equals("Dill")) {
                daysToExpire = 4;
            } else {
                daysToExpire = 7;
            }
         } //closes first if
        else if (productType.equals("Fruit")) {   ////this block checks if user entered type:fruit
            if (productName.equals("Raspberry")) {
                daysToExpire = 6;
            } else if (productName.equals("Banana")) {             //this block of code checks where our bananas from
                System.out.println("Where are your bananas from?");
                imported = sc.next(); }
                if (imported.equals("Peru")) {
                    daysToExpire = 11;
                } else if (imported.equals("Brazil")) {
                daysToExpire = 14;
        } else {
            daysToExpire = 30; }
        } //closes Fruit block
        if (productType.equals("Vegetable")) {  // block for veggies
            if (productName.equals("Tomato")) {
                daysToExpire = 20;
            } else if (productName.equals("Pumpkin")) {
                daysToExpire = 60;
            } else {
                daysToExpire = 90;
            }
        }
            System.out.println("This " + productName + " is going to expire in " + daysToExpire + " days");
        }
    }



