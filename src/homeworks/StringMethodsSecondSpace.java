package homeworks;

import java.util.Scanner;

public class StringMethodsSecondSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your message");
        String input = sc.nextLine();
        System.out.println(secondSpace(input));

    }
    public static int secondSpace(String input){
        int indexOfFirsSpace = input.indexOf(" ");
        int indexOfSecondSpace = input.indexOf(" ", indexOfFirsSpace+1);
        return indexOfSecondSpace;
    }
}
