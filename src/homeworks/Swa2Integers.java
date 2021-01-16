package homeworks;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Swa2Integers {
    public static void main(String[] args) {
    //Write a program called Swap2Integers that prompts user for two integers. The program shall read the inputs as int, save in two variables called number1 and number2;
        //
        // swap the contents of the two variables; and print the results. For examples,
        //
        //Enter first integer: 9
        //Enter second integer: -9
        //After the swap, first integer is: -9, second integer is: 9
        Scanner sc = new Scanner(System.in);
        System.out.println("So first number:");
        int lelek = sc.nextInt();
        System.out.println("And second number: ");
        int bolek  =sc.nextByte();
        System.out.println("Enter first integer:" + lelek + "\n" +
                "Enter second integer:" + bolek);
        int sebek = 0; //temp
        sebek = lelek;
        lelek = bolek;  //just having fun sorry
        bolek= sebek;
        System.out.println("After swap, first integer is: " + lelek +", second integer is: "+ bolek);



    }
}
