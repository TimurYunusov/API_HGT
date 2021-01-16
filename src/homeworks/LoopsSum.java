package homeworks;

import java.util.Scanner;

public class LoopsSum {
    public static void main(String[] args) {
        //Write a program that gets an integer from the user. Add up all the numbers from 1 to that number, and display the total. Use a for/
        //while loop to do it.
int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int toUse = sc.nextInt();
        for(int i = 1; i<=toUse; i++){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println();
        System.out.println("The sum is: "+sum );
    }
}
