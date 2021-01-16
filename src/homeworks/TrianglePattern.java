package homeworks;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        //Write a program called TrianglePattern that prompts user for the size (a non-negative integer in int); and prints the following triangle shape pattern.
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the pattern");
        int size = sc.nextInt();
        for (int i = 1; i < size; i++) {
            System.out.println("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.print("*");
        System.out.println();

    }
}
