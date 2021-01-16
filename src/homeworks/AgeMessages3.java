package homeworks;

import java.util.Scanner;

public class AgeMessages3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your name is : " + name);
        System.out.println("Your age is: " + age);
        if(age < 16) {
            System.out.println("You can't drive " + name);
        } if(age == 16 || age ==17) {
            System.out.println("You can drive but not vote + " +name);
        } if(age >=18 && age <= 24) {
            System.out.println("You can vote but not rent a car " + name);
        } if(age>=25) {
            System.out.println("You can do pretty much anything " + name);
        }

    }
}


