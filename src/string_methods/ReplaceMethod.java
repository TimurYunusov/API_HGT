package string_methods;

public class ReplaceMethod {
    public static void main(String[] args) {
        String str ="Learn Share Learn";
        String replacedStr = str.replace('e', 'E');
        System.out.println(replacedStr);

        String str1 = "123 main st";
        System.out.println(str1.replace('1', 'P'));

        String str2 = "Hello world";
        String changed = str2.replace("world", "World");
        System.out.println("");



        String str3 = "Hello 2020 Hell of a World";
        System.out.println(str3.replaceAll("ell", "me"));
    }
}
