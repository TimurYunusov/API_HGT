package if_then;

import java.util.Scanner;

public class IfSalary {
    public static void main(String[] args) {

        //
        //        //if married and salary is less than or equal to 60,000 => tax is 5%
        //        //if married and salary is more than 60,001 and less than or equal to 100,000 => 15%
        //        //if married and salary is more than 100,001 you pay => 20%
        //        //if not married and salary is less than or equal to60,000 => tax is 10%
        //        //if not married and salary is more than 60,001 and less than or equal to 100,000 => 20%
        //        //if not married and salary is more than 100,001 you pay => 25%

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you early earnings: ");
        int salary = sc.nextInt();
        System.out.println("Are you married? ");
        sc.nextLine();
        String married = sc.nextLine();

        if (salary <= 60000 && married.equals("yes")) {
            System.out.println("According your marital status and income your tax will be 5%;  which is $" + (salary*5/100)  );
        } else if (salary > 60000 && married.equals("yes") && salary <= 100000) {
            System.out.println("According your marital status and income your tax will be 15%;  which is $" + (salary*15/100) );
        } else if (salary >= 100001 && married.equals("yes")) {
            System.out.println("According your marital status and income your tax will be 20%;  which is $" + (salary*20/100) );

        } else if (salary <= 60000 && married.equals("no")) {
            System.out.println("According your marital status and income your tax will be 10%;  which is $" + (salary*10/100) );
        } else if (salary >= 60000 && married.equals("no") && salary <= 100000) {
            System.out.println("According your marital status and income your tax will be 15%;  which is $" + (salary*15/100) );
        } else if (salary > 10000 && married.equals("no")) {
            System.out.println("According your marital status and income your tax will be 25%;  which is $" + (salary * 25 / 100));
        } else { System.out.println("Wrong input");
    }
}
    }