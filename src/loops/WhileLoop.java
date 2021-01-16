package loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int iteration = 0;
        //print out hello world 10 times
        //loop, iteration,cycle all mean the same
        while (iteration < 10) {
            System.out.println("Hello world");
            iteration++;
        }
        int counter = 0;
        int amountOfTimes = 5;
        while (counter < amountOfTimes) {
            System.out.println("Java@Java");
            counter++;
        }

        System.out.println();
        int counter2 = 0;
        while (counter2 < 7) {
            System.out.println("JAVA " + ++counter2);
        }
        System.out.println();

        //calculate the sum of numbers from 1-12
        // ex:1+2+...
        int counter3 = 0;
        int sum = 0;
        //keep outside of the loop
        while (counter3 < 12) {
            //int sum=0 => dangeros bc will be reinitialized to 0 every time
            System.out.print(counter3 + "+");
            ++counter3;
            sum += counter3;

        }
        System.out.print("=" + sum);

        //homework above
        System.out.println();
        System.out.println("How many scores you want to enter:");

        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int count5 = 0;
        int sumOfAllScores = 0;
        while (count5 < times) {
            System.out.println("Enter Exam Score: ");
            int score = sc.nextInt();
            sumOfAllScores += score;
            count5++;
        }
        System.out.println("Your average score is : " + sumOfAllScores/times);


    }



}