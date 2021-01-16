package input_from_user;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Firstname: ");
        String firstname = sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastname =sc.nextLine();

        System.out.println("Enter your gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("Name: "+ firstname + " " + lastname);
        System.out.println("Gender: " + gender);
        System.out.println("Age " +age);
        System.out.println("Salary : "+ salary);






    }
}