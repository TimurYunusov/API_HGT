package homeworks;

import java.util.Locale;

public class ArrayPalindrome {
    public static void main(String[] args) {
        //A word that reads the same backward as forward is called a palindrome, e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive). Write a program called TestPalindromicWord, that prompts user for a word and prints ""xxx" is|is not a palindrome".
        //
        //
        //
        //Hints
        //Maintain two indexes, forwardIndex (i) and backwardIndex (j), to scan the phrase forward and backward.
        System.out.println(isPalindrome("Radar"));
        //

    }
    static boolean isPalindrome(String str)  {
        int i= 0, j= str.length() - 1;
        str = str.toLowerCase(Locale.ROOT);
        while (i < j) {
            if (str.charAt(i)!= str.charAt(j))
                      return false;
        //
         ++i;
           --j;
        }
        //
         return true;
        }
}
