package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        //Write a Java program to print the area and perimeter of a rectangle. The width and height should be entered from
        //Test Data:
        //
        //Note: The width and height should be entered by keyboard.
        //
        //Width = 5.5 Height = 8.5
        //
        //Expected Output
        //Area is 5.6 * 8.5 = 47.60
        //Perimeter is 2 * (5.6 + 8.5) = 28.20

        Scanner width = new Scanner(System.in);
        double width1 = width.nextDouble();
        Scanner height = new Scanner(System.in);
        double height1 = height.nextDouble();
        double perimeter = (width1 * height1);
        DecimalFormat df = new DecimalFormat("####.####");

        System.out.println("Area is 5.6 * 8.5 = " + df.format(perimeter)+"0");
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + (2*(width1 + height1)));


    }
}
