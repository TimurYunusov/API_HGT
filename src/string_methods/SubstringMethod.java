package string_methods;

import java.sql.SQLOutput;

public class SubstringMethod {
    public static void main(String[] args) {
        String str ="Hello";
        String result = str.substring(2);
        System.out.println(result);
String str1 = "United States of America";
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(str1.length()-7));
String item = "INFO account #124 is buying item Gold";
String gold = item.substring(item.length()-4);
boolean isGold = gold.equals("Gold");

String school = "DevX School";
String str5 = school.substring(0,4);
        System.out.println(str5);
        System.out.println(school.substring(5));

        String number = item.substring(14,17);
        System.out.println(number);
int num = Integer.parseInt(number);

    }
}
