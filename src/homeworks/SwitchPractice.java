package homeworks;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args){
        System.out.println("What is your favorite soccer team?");
        Scanner input = new Scanner(System.in);
        //int a = input.nextInt();
        switch(input.nextLine()) {
            case "Liverpool":
                System.out.println("You will never walk alone!");
                break;
            case "Barcelona":
                System.out.println("What a great choice! You definitely know football! ");
                break;
            case "Real":
                System.out.println("Come on bro you must be kidding me! ");
                break;
            case "Juventus":
                System.out.println("Mmm you like old ladies and pasta I assume");
                break;
            case "Manchester United":
                System.out.println("Well you probably miss Alex Ferguson a lot!");
            break;
                case "PSG":
                System.out.println("Nice one! Mbape and Neymar are making difference!");
                break;
            case "Bayern":
                System.out.println("Wow its a powerful one! Nice ran last season!");
                break;


            default:
                System.out.println("Seriously? Never heard about this team!");
                break;
        }





    }
}
