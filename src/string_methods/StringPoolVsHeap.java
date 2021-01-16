package string_methods;

public class StringPoolVsHeap {
    public static void main(String[] args) {
        String car = "Toyota";
        String car2 = "Lexus";
        String car3 = "Toyota";
        String car4 = new String("Toyota");

        boolean result = car==car2;
        boolean result2 = car == car3;
        boolean result3 = car2 == car3;
        boolean result4 = car4==car;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
