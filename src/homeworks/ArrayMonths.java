package homeworks;

import java.util.Arrays;

public class ArrayMonths {
    public static void main(String[] args) {
        //a) Print out all months
        //
        //b) By using index find the your birthday month among the String array below.
        //
        //Example: Apr

        String[] MONTHS = {
            "", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        System.out.println(Arrays.toString(MONTHS).replaceFirst(",", ""));
        System.out.println("My birthday in " + MONTHS[4] + "il");

    }
}
