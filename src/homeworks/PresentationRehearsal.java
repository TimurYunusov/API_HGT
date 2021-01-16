package homeworks;

import java.util.Scanner;

public class PresentationRehearsal {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");


while (!sc.hasNextInt()) {
    sc.next();
    System.out.println("Only integers allowed. Try again!");
}
        int age = sc.nextInt();
        System.out.println("Your age is "+ age);






    }
}
