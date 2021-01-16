package homeworks;

import java.util.Scanner;

public class LoopAdding {
    public static void main(String[] args) {
        //Adding Values in a Loop
        //Write a program that gets several integers from the user. Sum up all the integers they give you. Stop looping when they enter a 0. Display the total at the end.
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me");
        System.out.println("Number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
            sum+=n;
            System.out.println("The total so far is: " +sum);
            System.out.println("Number: ");
            n= sc.nextInt();
        }

    }
}
