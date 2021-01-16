package homeworks;

public class CheckOddEven {
    // Save as "CheckOddEven.java"
    //Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The program shall always print “bye!” before exiting.
    //Hints
    //n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0.
    //
    ///**

        public static void main(String[] args) {  // Program entry point
            int number = 49;       // Set the value of "number" here!
            System.out.println("The number is " + number);
            if (number%2==0) {
                System.out.println("Even number");   // even number
            } else {
                System.out.println("Odd number");   // odd number
            }
            System.out.println("Bye!");
        }
    }

