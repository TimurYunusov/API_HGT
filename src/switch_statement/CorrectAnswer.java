package switch_statement;

import java.util.Scanner;

public class CorrectAnswer {
    public static void main(String[] args) {
        System.out.println("What is JRE:");
        System.out.println("A. Joe Rogan Expirience ");
        System.out.println("B. Java Virtual Machine");
        System.out.println("C. Java Runtime Enviroment");
        System.out.println("D. Compiler");
        Scanner sc = new Scanner(System.in);
        char answer = sc.next().charAt(0);
        switch (Character.toLowerCase(answer)) {
            case 'a':
            case 'b':
            case 'd':
                System.out.println("Your answer is wrong!");
                        break;
            case 'c':
                System.out.println("Congratulations! Welcome to our company!");
                break;
            default: System.err.println("Wrong input!");
        }

    }
}
