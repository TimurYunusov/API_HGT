package homeworks;

import java.util.Scanner;

public class EnterPIN {
        public static void main( String[] args )
        {
            Scanner keyboard = new Scanner(System.in);
            int pin = 12345;

            System.out.println("WELCOME TO THE BANK OF MITCHELL.");
            System.out.print("ENTER YOUR PIN: ");
            int entry = keyboard.nextInt();

            while ( entry != pin )
            {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.print("ENTER YOUR PIN: ");
               entry = keyboard.nextInt();
            }

            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }

    }
//assignments turned in without these things will receive no credit.
//
//How is a while loop similar to an if statement?

// ->  They similar because both of them have boolean expression in parenthesis which is responsible for execution of block of code.

//How is a while loop different from an if statement?
// -> In if statement block of code executes only once if condition expression is true, when while loop continues to execute the code in the while statement for however long the expression is true.

//Inside the while loop, why isn't there an int in front of the line entry =
//keyboard.nextInt()?
//-> Because we already declared variable entry above

//Delete the line entry =keyboard.nextInt(); from inside the while loop. What happens? Why?
//-> we will have only one attempt to enter correct pin and if we failed while loop will became infinite loop because our condition expression will never have a chance to
//became false.

