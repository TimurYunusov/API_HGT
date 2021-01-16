package arithmetic_operators;

public class TextAndNums {
    public static void main(String[] args) {
        int a=10, b=11;
        System.out.println("some text" + a + b);
        System.out.println(" " + (a+b));
        //System.out.println("text" +a - b); //Strings can only work
        // with + thus text10 - b doesn't compile;
        System.out.println("apples" +a*b);
        System.out.println("hello " + (double)a/b);
        //System.out.println ("line 15 " + b); you can only use + With String
    a =5;
    System.out.println("value of a after reassignment: " +a);
    a= 66;
        System.out.println("value of a line 23: " +a);
    System.out.println("test assignment operator " + (a=b)); // changing value of a to 11
        // assignment operator changes the value of a variable om the left to what ever is on the right

    }
}
