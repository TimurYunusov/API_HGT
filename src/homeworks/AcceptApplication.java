package homeworks;

import java.util.Scanner;

public class AcceptApplication {
    public static void main(String[] args) {
        //Write a function which will ask user for:
        //
        //1. years in college
        //
        //2. years of programming experience
        //
        //3. GPA
        //
        //and return true or false.
        //
        //
        //
        //An applicant must meet two conditions to be called for interview:
        //
        //4 or more years of college, AND
        //
        //2 years experience programming in Java OR a grade point average greater than 3.5.

        Scanner sc = new Scanner(System.in);
        System.out.println("Years in college:");
        int yearsInCollege = sc.nextInt();
        System.out.println("Years of programming experience");
        int yearsOfProgramming = sc.nextInt();
        System.out.println("GPA");
        double GPA =sc.nextDouble();
        System.out.println(isAccepted(yearsInCollege,yearsOfProgramming,GPA));

    }
    public static boolean isAccepted(int yearsInCollege,int yearsOfProgramming, double GPA){
        return (yearsInCollege>=4 && (yearsOfProgramming>=2 || GPA >=3.5));
    }
}

