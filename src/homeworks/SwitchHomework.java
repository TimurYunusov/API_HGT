package homeworks;

import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args) {
        ////given a day in word ex: Monday, Tuesday etc.
        //        //tell if it's a weekday or a weekend
        //        //ex: Enter a day
        //        //Wednesday  --> user input
        //        //Weekday -> output
        //        //given a day in both word and in number ex: Monday, Tuesday, 2,3,4,7 etc.
        //        //tell if it's a weekday or a weekend
        //        //ex: Enter a day in number or word
        //        //7
        //        //Weekend
        //        //ex: Enter a day in number or word
        //        //Saturday
        //        //Weekend
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter day(1-7)");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;

        }
        sc.nextLine();
        System.out.println("Enter day of the week below:");

        String day1 = sc.nextLine();
        switch (day1) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;


        }

    }


}
