package string_methods;

public class Immutability {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2").concat("3");
        System.out.println(s2);
    }
}
