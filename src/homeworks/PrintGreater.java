package homeworks;

import java.util.Scanner;

public class PrintGreater {
    public static void main(String[] args){
        //Take two numbers from the user and print the greatest number.
        //
        //Test Data
        //Input the 1st number: 25
        //Input the 2nd number: 87
        //Expected Output :
        //The greatest: 87
        Scanner number1 = new Scanner(System.in);
        int num1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        int num2 = number2.nextInt();
        if (num1 > num2) {
            System.out.println("The greatest: " + num1);
                    } if(num2 > num1) {
            System.out.println("The greatest: " + num2);
        } else {
            System.out.println("Wrong input");
        }
    }
}
