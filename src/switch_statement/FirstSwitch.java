package switch_statement;

import java.util.Scanner;

public class FirstSwitch {
    public static void main(String[] args) {
        //Domestic or wild
        //Chicken, Horse, Cat, Dog
        //Tiger, Snake, Hippo, Rhino
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal");
        String animal = sc.nextLine();
        int num = 10;
        //inside switch parentheses we need use a variable that we want to compare
        //we are telling compare this animal to the following case
        //switch statement only and only uses == or.equals comparison operators
        switch (animal.toLowerCase()) {
            //case followed by a constant value and:
            case "chicken":
            case "horse":
            case "cat":
            case "dog":
                System.out.println(animal + " it's domestic animal");
                break; // break out of the whole switch
            case "tiger":
            case "hippo":
            case "snake":
            case "rhino":
                System.out.println(animal + " it's wild animal");
                break;
            default:
                System.out.println("Unknown animal");
        }
        System.out.println(num);

    }
}
