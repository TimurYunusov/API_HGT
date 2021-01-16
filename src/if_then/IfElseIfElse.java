package if_then;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //if else
        //find out if the given number is even or odd?
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // people from 18 till 60 are eligible to work
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are minor \n Not aligible to work");

        }  else if (age > 18 && age < 60) {
            System.out.println("You are eligible to work \n Fill out application");

        }  else  {
            System.out.println("You are a senior\n Collect your pension");
        }

    }
}