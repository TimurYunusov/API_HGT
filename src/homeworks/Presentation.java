package homeworks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");

while (!sc.hasNextInt()) {
    sc.next();
    System.out.println("Only integers allowed. Try again!");
}
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
    }
}
