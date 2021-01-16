package methods;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter years of experience:");
        int years = sc.nextInt();
        if (years <= 0) {
            System.out.println("Wrong input!");
        } else {
            System.out.println("Please enter your salary");
            double salary = sc.nextDouble();
            System.out.println("Your bonus will be: $" + bonus(years, salary));
//
        }
    }

    public static double bonus(int years, double salary) {
        double bonus = 0;
        if (years < 2) {
            return bonus = salary * 5 / 100;
        } else if (years >= 2) {
            return bonus = salary * 10 / 100;
        } else {
            return 0;
        }
    }
}
