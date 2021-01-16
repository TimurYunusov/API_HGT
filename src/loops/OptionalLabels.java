package loops;

import java.util.Locale;

public class OptionalLabels {
    public static void main(String[] args) {
        //optional labels
        int num = 0;
        while (num < 10) {
            if (num == 3) {
                //break;//stops while loop when num==3;
                //continue; //
            }
            for (int i = 0; i < 15; i++) { // supused to run 15 times for each num
                if (num == 3) {
                    break;
                }
                System.out.print("num " + num + " i: " + i);

            }
            System.out.println();
            System.out.println("-----------------------------------");
            num++;
        }

        System.out.println(isPalindrome("Civicc"));
        System.out.println(check("book"));
        System.out.println(ransomChars("helloe", "heololle"));
        System.out.println(ransomChars("jjava", "avjjpna"));


    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        abc:
        for (int i = 0; i > str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return false; // when you have return in the body of the loop
                //it will act as a break statement to the whole method and return result
            }
        }
        return true;
    }

    //check if the string has at least 2 "oo"
    public static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("oo")) {
                return true;
            }
        }
        return false;
    }
    //write a function which takes two String
    //str1 and str2
    //check if you are able to build str1 using characters from str2?

    public static boolean ransomChars(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        if (l1 > l2) {
            return false;
             }


        outer:    for (int i = 0; i < l1; i++) {
                boolean found = false;
              inner:  for (int j = 0; j < l2; j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {
                        found = true;
                        str2 = str2.replaceFirst(str2.charAt(j) + "", "");
                        continue outer;
                    }
                }
                if (!found) {
                    return false;
                }
            }

        return true;
    }
}