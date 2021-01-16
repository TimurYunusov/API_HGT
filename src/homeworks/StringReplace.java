package homeworks;
public class StringReplace {
    public static void main(String[] args) {
        //By using replace method please change x to capital X.
        ////input "oxoxoxox";
        //// output is  "oXoXoXoX"
        String given = "oxoxoxoxox";
        String toReturn = given.replaceAll("x", "X");
        System.out.println(toReturn);
    }
}
