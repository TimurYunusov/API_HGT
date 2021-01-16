package loops;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        //ask user to enter score
        // ask user if they want to enter another score

        //Please enter test result
        //100
        //Do you want to enter another test result?
        //yes,no
        Scanner sc = new Scanner(System.in);
        String answer = "yes";
        int allScores= 0;
        int counter = 0;

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter test result");
            int score = sc.nextInt();

            if (score < 0 || score > 100) {
                System.err.println("Error");
                System.exit(1);

            }
                allScores += score;
                sc.nextLine();
                System.out.println("Do you want to enter another score?");
                answer = sc.nextLine().trim();
                counter++;
            }

            System.out.println("Average: " + allScores / counter);

        }
        }


