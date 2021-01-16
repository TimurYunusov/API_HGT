package if_then;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //if the given year is leap or not
        // leap years the ones that have 366
        //a year is leap if it's divisible by 4
        // if year is divisible by 100 it's if it also divisible by 400
        System.out.println("Please enter year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("This year is leap year");
            } else {
                System.out.println("This year is not leap year"); }
        } else if (year % 4 ==  0) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("This year is not leap year");
        }
    }
}