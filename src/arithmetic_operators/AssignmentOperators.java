package arithmetic_operators;

import java.lang.invoke.SwitchPoint;

public class AssignmentOperators {
    public static void main(String [] args) {
        //assignment operators
        String str = "Hello World";
        System.out.println(str);
         str = "Hello Mars";
        System.out.println(str);
        //compound assignment operators can only be used with numbers
        //only += can be used with String

        int carMilage = 1000;
        int milesUntilHome = 50;
        /*int finalMilage = carMilage + milesUntilHome;
        System.out.println("car milage " + finalMilage);

        int milageUntilFrieands = 28;
        int milageWhenShowingToFriends = finalMilage+milageUntilFrieands;
        System.out.println("Milage when showing to friends" + milageWhenShowingToFriends);

        int FinalMilageAfterShowFriends = milesUntilHome+milageWhenShowingToFriends;
        System.out.println("Finally home let me check what's the milage " + FinalMilageAfterShowFriends);
        */
        int milesFromHomeToFrinds = 28;
        carMilage+=milesUntilHome;

        System.out.println("Milage when got home from dealership " + carMilage);
        carMilage+=milesFromHomeToFrinds;
        System.out.println("Milage when got to friends place " + carMilage) ;

        //given that salary grows 3% per year
        //find me what will be my salary after 5 years
        int currentYear = 2020;
        int periodOfYears = 5;
        double currentYearSalary = 100_000.00; //we can use _ to separate numbers

        double salaryIncrease  = 1.03;

        currentYearSalary *=salaryIncrease;
        System.out.println(currentYearSalary);
        currentYearSalary *=salaryIncrease;
        System.out.println(currentYearSalary);
        currentYearSalary *=salaryIncrease;
        System.out.println(currentYearSalary);
        currentYearSalary *=salaryIncrease;
        System.out.println(currentYearSalary);
        currentYearSalary *=salaryIncrease;
        System.out.println(currentYearSalary);

    }
}
