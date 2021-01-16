package string_methods;

public class Length {
    public static void main(String[] args) {
     String str = "Timur Yunusov";
     int howMany =str.length();
        System.out.println(howMany);
        String steve = "Steve Jobs";
        int nameWithoutOneSpace = steve.length() - 1;
        System.out.println(nameWithoutOneSpace);
    }
}
