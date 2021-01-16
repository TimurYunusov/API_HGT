package homeworks;

import java.util.Scanner;

public class ComparisonIf {
    public static void main(String[] args) {
        //Write a Java program to compare two numbers.
        //Input Data:
        //Input first integer: 25
        //Input second integer: 39
        //Expected Output
        //
        //
        //25 < 39     or       39 > 25        or       "The fist number is smaller"

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int first = sc.nextInt();
        System.out.println("Please enter second integer: ");
        int second = sc.nextInt();
        if(first > second) {
            System.out.println((first + ">" +second) + " The first number is bigger");
        } if (first < second) {
            System.out.println((first+ "<" +second) + " The first number is smaller");
        } else {
            System.out.println((first+ "=" +second) + "The numbers are equal");
        }
    }
}
