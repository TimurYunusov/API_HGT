package homeworks;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        //Write a program in Java to input 5 numbers from keyboard and find their sum and average.
        //
        //Test Data
        //Input the 5 numbers : 1 2 3 4 5
        //Expected Output :

        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        int d = sc4.nextInt();
        Scanner sc5 = new Scanner(System.in);
        int e = sc5.nextInt();
        double average = (a+b+c+d+e)/5;
        System.out.println("The sum of 5 no is : " +(a+b+c+d+e));
        System.out.println("The Average is : " + average);


    }
}
