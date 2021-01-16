package homeworks;

public class StringNumber1 {
    public static void main(String[] args) {
        //Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2,
        // return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
        //
        //
        //firstTwo("Hello") → "He"
        //firstTwo("abcdefg") → "ab"
        //firstTwo("ab") → "ab"'
        StringNumber1 string1 = new StringNumber1();
        System.out.println(string1.firstTwo(""));
        System.out.println(string1.firstTwo("X"));
        System.out.println(string1.firstTwo("Hello"));
        System.out.println(string1.firstTwo("Barcelona"));

    }

    public String firstTwo(String str) {
        int l = str.length();
        if (l < 2) return str;
        else return str.substring(0, 2);
    }
}