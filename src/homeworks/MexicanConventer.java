package homeworks;

import java.util.Scanner;

public class MexicanConventer {
    public static void main(String[] args) {
        ////write a program to convert dollars to mexican pesos
        //        //amount of dollars should be given by user
        //Co
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount in dollars: ");
        double dollars = sc.nextDouble();
        double peco = dollars * 20.07;
        System.out.println("$"+ dollars+" equals: " + peco + " Mex$");

    }
}
