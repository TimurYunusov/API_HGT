package homeworks;

import java.util.Scanner;

public class Assignment4a {
public static void main(String [] args){
    //Write a Java program to print the area and perimeter of a circle.
    //Test Data:
    //
    //Note: The radius should be entered by keyboard.
    //
    //Formula:   Perimeter=2*radius*3.14;              Area=3.14*radius*radius;
    //
    //Radius = 7.5
    //Expected Output
    //Perimeter is = 47.12388980384689
    //Area is = 176.71458676442586
    Scanner radius = new Scanner(System.in);
    double radius1 = radius.nextDouble();
    double perimeter = 2* radius1 * 3.14159265359;
    double area = 3.14159265359 * radius1 * radius1;
    System.out.println("Perimeter is = " + perimeter);
    System.out.println("Area is = " + area);


}
}
