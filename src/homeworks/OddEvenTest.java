package homeworks;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number here:");
        int number = sc.nextInt();
        if(isOdd(number)){
            System.out.println(number + " is an odd number");
        } else if (!isOdd(number)){
            System.out.println(number + " is an even number");
        }


    }
    //isOdd() (method)
    //Write a boolean method called isOdd() in a class called OddEvenTest, which takes an int as input and returns true if the it is odd. The signature of the method is as follows:
    //
    public static boolean isOdd(int number){
        return (number%2!=0);
    }
    //Also write the main() method that prompts user for a number, and prints "ODD" or "EVEN". You should test for negative input. For examples,
    //
    //Enter a number: 9
    //9 is an odd number
    //
    //Enter a number: 8
    //8 is an even number
    //
    //Enter a number: -5
    //-5 is an odd number
}
