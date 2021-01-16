package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsMilesToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormatter = new DecimalFormat("0.00");
        System.out.println("please enter how many miles you want to convert to km:");
        double result =convertMilesToKm(sc.nextDouble());
        System.out.println("Your result is: " +decimalFormatter.format(result) + "km");
    }
    public static double convertMilesToKm(double miles){
        double km = miles * 1.609344; //1.609344
        return km;
    }
}
