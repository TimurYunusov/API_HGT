package loops;

public class WhileLoopWithStrings {
    public static void main(String[] args) {
        //print out every single character from a string
        String str = "DevX School";

        int index = 0;
        int l = str.length();

        while (index < l) {
            System.out.println(str.charAt(index));
            index++;
        }





    }
    //public static String reverse(String str)
}