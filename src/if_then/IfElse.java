package if_then;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //if the number is positive or negative
        int num = -10;
        if (num>0) {
            System.out.println("Number is positive");
                    }
        if (num < 0) {
            System.out.println("Negative");
        }
        //if(num ==0) {
            //System.out.println("Zero");
        //}
        if (num>=0){
            System.out.println("Positive too");
        }
        else{
            System.out.println("Negative");
        }
        //I can sleep if day is weekend
        //or I'm on vacation
        boolean isWeekday = true;
        boolean onVac = false;
        if (!isWeekday || onVac) {
            System.out.println("Sleep");
        } else {
            System.out.println("Wake up you are late!");
        }
    double balance = 1000;
        Scanner sc = new Scanner(System.in);
        double transactionAmount = sc.nextDouble();

     if (transactionAmount <=800 && balance>=transactionAmount) {
         System.out.println("Approved");
         balance -= transactionAmount;
         System.out.println("The balance after transaction :" + balance);
     } else {
         System.out.println("Declined");

     }


    }
}
