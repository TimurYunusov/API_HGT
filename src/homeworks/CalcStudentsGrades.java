package homeworks;

import java.util.Scanner;

public class CalcStudentsGrades {
    public static void main(String[] args) {
        //This program calculates the grade of a student based on the marks entered by user in each subject. Program prints the grade based on this logic.
        //If the average of marks is >= 80 then prints Grade ‘A’
        //If the average is <80 and >=60 then prints Grade ‘B’
        //If the average is <60 and >=40 then prints Grade ‘C’
        //else prints Grade ‘D

        Scanner sc = new Scanner(System.in);
System.out.println("How many marks do you have? ");
        int marks = sc.nextInt();
        if (marks >= 80) {
            System.out.println("Grade 'A'");
        } else if (marks < 80 && marks >= 60) {
            System.out.println("Grade 'B'");
        }
        else if(marks<60 && marks>= 40) {
            System.out.println("Grade 'C'");
        } else {System.out.println("Grade 'D'"); }
    }

}

