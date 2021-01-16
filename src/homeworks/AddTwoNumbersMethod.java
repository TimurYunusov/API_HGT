package homeworks;

import java.util.Scanner;

public class AddTwoNumbersMethod {
    public static void main(String[] args) {
        //Write a method called add2Integers(8,9) that prompts user to enter two integers. The program shall read the two integers as int;
        // compute their sum; and print the result. For example,
        //
        //Enter first integer: 8
        //Enter second integer: 9
        //The sum is: 17
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        System.out.println("First integer: " + a);
        System.out.println("Second integer: " + b);
        System.out.println("The sum of two integers is: " + add2Integers(a,b));

    }

    public static int add2Integers(int a, int b) {
        int sum=a+b;
    //System.out.println("The sum is: " + (a+b));
        return sum;
    }
}
