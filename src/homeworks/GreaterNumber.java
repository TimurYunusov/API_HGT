package homeworks;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        //Take three numbers from the user and print the greatest number.
        //
        //Test Data
        //Input the 1st number: 25
        //Input the 2nd number: 78
        //Input the 3rd number: 87
        //Expected Output :
        //The greatest: 87
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        int d= 67;
        //int max = a > b && a > c ? a : (b>c ? b : c);  //that would be enough but I wanted to play around
        int max2 = a>b && a>c && a>d ? a: (b>c && b>d ? b : (c>d ? c : d));
        System.out.println("The greatest: " + max2);
    }
}
