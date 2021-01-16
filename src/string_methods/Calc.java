package string_methods;

public class Calc {
    public static void main(String[] args) {
        //method overloading
        System.out.println(multiply(12, 10));
        System.out.println(multiply(12.3, 10.5));
        System.out.println(multiply("10.5", "45.5"));
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;

    }

    public static double multiply(String num1, String num2) {
        return Double.valueOf(num1) * Double.valueOf(num2);
    }
}