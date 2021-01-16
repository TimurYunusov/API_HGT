package homeworks;

import java.util.Scanner;

public class MethodsExam {
    public static void main(String[] args) {

        //    //write a method which give me exam grade based on the exam score
        //    //90 and 100 - A
        //    //80 and 90  - B
        //    //70 and 80 - C
        //    //60 and 70 - D
        //    //anything below F
        //    //you need take exam score as int
        //    //return char
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your exam score above: ");
        int score = sc.nextInt();
        System.out.println(Exam(score));
    }

    public static char Exam(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else if (score < 60) {
            return 'F';
        } return '0';
    }

    }






