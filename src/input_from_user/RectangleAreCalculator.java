package input_from_user;

import java.util.Scanner;

public class RectangleAreCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length(sm): ");
        int length = sc.nextInt();
        System.out.println("Enter width(sm): ");
        int width = sc.nextInt();
        System.out.println("Perimeter of rectangle = " + 2 * (length + width) + "sm");
        System.out.println("Area of the rectangle =  " + (length * width) + "sm2");

    }
}
