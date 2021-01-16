package input_from_user;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverterClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double liters = sc.nextDouble();
        DecimalFormat decimalFormatter = new DecimalFormat(".000");
        System.out.println(liters + " liters = " + decimalFormatter.format(liters/3.7) +" gallons");



    }
}
