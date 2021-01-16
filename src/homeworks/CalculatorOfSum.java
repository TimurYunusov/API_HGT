package homeworks;

import java.util.Scanner;

public class CalculatorOfSum {
    /*    1. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true
    */
    public static void main(String[] args) {
        System.out.println("Input the first number");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Input the second number");
        int second = sc.nextInt();
        System.out.println("Input the third number");
        int sum = sc.nextInt();

        if (first + second == sum) {
            System.out.println("The result is: true");
        } else {
            System.out.println("Wrong input");
        }
    }
}