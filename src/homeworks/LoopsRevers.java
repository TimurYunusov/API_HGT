package homeworks;

import java.util.Scanner;

public class LoopsRevers {
    public static void main(String[] args) {
        //write a method that takes a String and returns
        //a reversed String.

        //ex: public static String reverse(String str){
        //}
        //ex: reverse("Hello") -> olleH
        // Note: Use StringBuilder.
        //But still return a String

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word!");
        String str = sc.nextLine();
        System.out.println(reverse(str));
        

//String str3 = "Hello";
//        System.out.println(str3.indexOf("llo"));
    }

    public static String reverse(String str) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        return str1.toString();

    }

}
