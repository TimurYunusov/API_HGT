package homeworks;

import java.text.DecimalFormat;

public class CountVowelsDigits {
    public static void main(String[] args) {
        //CountVowelsDigits (String & char)
        //Write a program called CountVowelsDigits, which prompts the user for a String, counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints the counts and the percentages (rounded to 2 decimal places).  For example,
        //
        //Enter a String: testing12345
        //Number of vowels: 2 (16.67%)
        //Number of digits: 5 (41.67%)
        String test= "testing12345";
        int l = test.length();
        int vowelCounter =0;
        int digitCounter = 0;
        for(int i = 0; i<l;i++){
            if(test.charAt(i) == 'a' || test.charAt(i)=='e' || test.charAt(i) == 'i'
            || test.charAt(i) == 'o' || test.charAt(i)=='u' || test.charAt(i) == 'A'
                    || test.charAt(i) == 'E' || test.charAt(i)=='I' || test.charAt(i) == 'O' || test.charAt(i) == 'U'){
                vowelCounter++;
            } else if(test.charAt(i) == '0' || test.charAt(i)=='1' || test.charAt(i) == '2'
                    || test.charAt(i) == '3' || test.charAt(i)=='4' || test.charAt(i) == '5'
                    || test.charAt(i) == '6' || test.charAt(i)=='7' || test.charAt(i) == '8' || test.charAt(i) == '9'){
                digitCounter++;
                            }
        }
        DecimalFormat formatter = new DecimalFormat(".00");
        System.out.println("Number of vowels: "+vowelCounter+" (" +formatter.format((double) vowelCounter/l*100) +")");
        System.out.println("Number of digits: "+digitCounter+" (" +formatter.format((double) digitCounter/l*100) +")");

    }
}
