package homeworks;

public class StringReturnHalf {
    public static void main(String[] args) {
        //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        //
        //
        //firstHalf("WooHoo") → "Woo"
        //firstHalf("HelloThere") → "Hello"
        //firstHalf("abcdef") → "abc"\

        String given = "WooHoo";
        String toReturn = given.substring(0, given.length()/2);
        System.out.println(toReturn);
    }
}
