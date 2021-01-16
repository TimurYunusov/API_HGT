package homeworks;

public class AsksRequests {
    public static void main(String[] args) {
        //Also -> can you write a method that would print out number of occurences of each chacters
        //ex: Hello -> H-1, e-1, l-2, o-1 (edited)
        String str = "Hello";
        System.out.println(repeatedChars(str));
    }

    public static String repeatedChars(String str){
       int l= str.length();
       String toReturn = "";
       int counter = 0;
        for(int i =0; i<l; i++) {
            toReturn += str.charAt(i) + " ";

            for (int j = i + 1; j < l; j++) {
                char ch1 = str.charAt(i);
                if(ch1 == str.charAt(j))
                    counter++;
                String xi = ch1 + "" + counter;
            }
        }
        return toReturn;
    }
}
