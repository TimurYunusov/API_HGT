package homeworks;

public class Four_Methods {
    //Please write 4 different return type methods for the Calculator class
    //
    //input numbers  are int a=21;  int b=3;
    //
    //a) addNumbers(a,b)
    //
    //b) divideNumbers(a,b)
    //
    //c) multiplyNumbers(a,b)
    //
    //d) subtractNumbers(a,b)
    public static void main(String[] args) {
        int a =21, b =3;
        System.out.println(addNumbers(a,b));
        System.out.println(divideNumbers(a,b));
        System.out.println(multiplyNumbers(a,b));
        System.out.println(subtractNumbers(a,b));
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int divideNumbers(int a, int b) {
        return a / b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static int subtractNumbers(int a, int b) {
        return a-b;
    }






}
