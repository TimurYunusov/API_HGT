package arithmetic_operators;

import java.util.Scanner;

public class MathWithSofiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type any number you want to get square root:");
        double num = sc.nextDouble();
        System.out.println("The square root of "+Math.round(num)+ " is " + Math.round(Math.sqrt(num)));



    }
}
