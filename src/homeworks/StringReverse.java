package homeworks;

public class StringReverse {
    public static void main(String[] args) {
        //Write a program called ReverseString, which prompts user for a String, and prints the reverse of the String by extracting and processing each character. The output shall look like:
        //
        //Enter a String: abcdef
        //The reverse of the String "abcdef" is "fedcba".

        String given = "Washington";
        String reverse = "";
        for(int i = 1; i<given.length()+1; i++){
           reverse += ""+ given.charAt(given.length()-i);
        }
        System.out.println("The reverse of the string "+ " \"" +given+ "\"" +" is " + "\""  +reverse + "\"");

    }
}
