package homeworks;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Please calculate the area of a triangle. The user should enter width and height of the right triangle.
        //
        //The formula is varied for different types of triangle, but the most common formula that was used as
        //
        //Area=(Height x Base) /2
        //
        //Output :
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width of triangle: ");
        int width = sc.nextInt();
        System.out.println("Please enter the height of triangle: ");
        int height = sc.nextInt();

        double area = (height * width)/2;
        System.out.println("Area of triangle is: " + area);


    }
}
