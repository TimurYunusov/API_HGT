package junit;

import java.text.DecimalFormat;

public class ClassesToTest {
    public static double calculateBonus(int yearsOfService, double salary) {
        if (yearsOfService < 5) {
            return salary * 5 / 100;
        } else {
            return salary * 10 / 100;
        }
    }
    public static double convertFtoC(double f){

        DecimalFormat dc =new DecimalFormat((".00"));
        return Double.parseDouble(dc.format((f-32.0) * 5.0/9.0));
    }
    public static String reversesArray (String [] arr) {
        int size = arr.length;
        StringBuilder result = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            if(arr[i] == null){
                return null;
            }
            result = result.append(arr[i]);
                    if(i>0) result.append(" -> ");

        }
        return result.toString();
    }
}
