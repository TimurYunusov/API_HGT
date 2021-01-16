package switch_statement;

import java.util.Scanner;

/**
 * Tell a student which classes they have to take.
 * <p>
 * Which major are you in?
 * - Accounting  --> year 1 and 2 should take Math 1,2. Calculus.  3,4 -> Excel, Macroeconomics. Microeconomics.
 * - Computer Science --> year 1 and 2 should take Math 1,2, Calculus. 3,4 => Java, Intro to Information Systems.
 * - Psychology  --> year 1 and 2 should take Public Speaking, Body Language. 3,4 Psychology, Neuroscience.
 * <p>
 * <p>
 * Which college year are you in?
 */
public class EnrollmentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which major are you in?");
        String major = sc.nextLine();
        System.out.println("What year in college?");
        int year = sc.nextInt();
        if (year > 4 && year < 1) {
            System.out.println("Wrong year");
        } else {

            switch (major.toLowerCase()) {
                case "accounting":
                    switch (year) {
                        case 1:
                        case 2:
                            System.out.println("You should take Math 1,2. Calculus. ");
                            break;
                        case 3:
                        case 4:
                            System.out.println("Excel, Macroeconomics. Microeconomics.");
                            break;

                    }
                    break;


                case "computer science":
                    switch (year) {
                        case 1:
                        case 2:
                            System.out.println("You should take Math 1,2. Calculus. ");
                            break;
                        case 3:
                        case 4:
                            System.out.println("Java, Intro to Information Systems.");
                            break;
                        default:

                    }
                    break;
                case "psychology":
                    switch (year) {
                        case 1:
                        case 2:
                            System.out.println("You should take Public Speaking, Body Language. ");
                            break;
                        case 3:
                        case 4:
                            System.out.println("Psychology, Neuroscience.");
                            break;

                    }
                    break;
                default:
                    System.out.println("Wrong input");


            }

        }

    }
}