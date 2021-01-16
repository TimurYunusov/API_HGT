package input_from_user;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius of your circle: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Area of a circle is: " + 3.14*(radius*radius));

    }
}
