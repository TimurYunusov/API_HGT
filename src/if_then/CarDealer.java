package if_then;

import java.util.Scanner;

public class CarDealer {
    public static void main(String[] args) {
        //we have car dealer
        //you have to prompt the user for what they are looking for
        //SUV - 1.Suburban
        //     - 2.Escalate
        //       - 3.H2
        // if user inputs something outside this list say We dont have it on stack
        //Sports car
        //          1.  -Bugatti
        //        2.  -Ferrari
        //sedan
        //          - 1. Camry
        //          - 2. BMW
        System.out.println("Choose body of your future car: \n 1.SUV \n 2.Sport car  \n 3. Sedan");
        Scanner sc = new Scanner(System.in);
        String body = sc.nextLine();
        String model = "";
        if (body.equals("SUV") || body.equals("1")) {//open outer
            System.out.println("Chose model you interested in: \n 1.Suburban \n 2. Escalate \n 3. H2");
            model = sc.nextLine();
            if (model.equals("Suburban") || model.equals("1")) {
                System.out.println("We have Suburban 2018 for just $29_000");
            } else if (model.equals("Escalate") || model.equals("2")) {
                System.out.println("We have Escalate 2019 for just $42_000");
            } else if (model.equals("H2") || model.equals("3")) {
                System.out.println("We have Hummer2 2016 for just $36_000");
            } else {
                System.out.println("We don't have it on stack");
            }
        } else if (body.equals("Sport car") || body.equals("2")) {//open outer
            System.out.println("Chose model you interested in: \n 1.Bugatti \n 2. Ferrari");
            model = sc.nextLine();
            if (model.equals("Bugatti") || model.equals("1")) {
                System.out.println("We have brand new Bugatti 2021 for just $899_000");
            } else if (model.equals("Ferrari") || model.equals("2")) {
                System.out.println("We have Ferrari 2018 for just $99_000");
            } else {
                System.out.println("We don't have it on stack");
            }
        } else if (body.equals("Sedan") || body.equals("3")) {//open outer
            System.out.println("Chose model you interested in: \n 1.Camry \n 2. BMW");
            model = sc.nextLine();
            if (model.equals("Camry") || model.equals("1")) {
                System.out.println("We have brand new Camry 2021 for just $29_000");
            } else if (model.equals("BMW") || model.equals("2")) {
                System.out.println("We have BMW 747 2017 for just $64_000");
            } else {
                System.out.println("We don't have it on stack");
            }
        } else {
            System.out.println("Wrong input");
        }
    }
}