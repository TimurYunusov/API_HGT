package arithmetic_operators;

import java.util.Scanner;

public class IfFirstBlood {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random()*10);
        System.out.println("Guess number: ");
    Scanner sc = new Scanner(System.in);
    int response = sc.nextInt();
    if (response == randomNum) System.out.println("Yay! You guessed it right");
    else if(response>randomNum)  {
        System.out.println("Too big! Try again!");
        System.out.println("Guess the number: ");
        response = sc.nextInt();
        if(response == randomNum) System.out.println("Yay! You guessed it right!");
 else System.out.println("You lost " + randomNum + "  was the number!");
    }
    else if(response<randomNum) {
        System.out.println("Too small! Try again!");
        System.out.println("Guess the number: ");
        response = sc.nextInt();
        if(response == randomNum) System.out.println("Yay! You guessed it right!");
        else System.out.println("You lost! " + randomNum + "  was the number!");
    }

    }


    }

