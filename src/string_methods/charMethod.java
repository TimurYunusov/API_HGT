package string_methods;

import java.util.Scanner;

public class charMethod {
    public static void main(String[] args) {
        String str = "Elon Musk";
        char firstInitial = str.charAt(0);
        char SecondInitial = str.charAt(5);

        System.out.println(firstInitial + "." + SecondInitial + ".");
        Scanner sc = new Scanner(System.in);

        String initials = sc.nextLine();
        boolean isFormat = isFormatRight(initials);
        System.out.println(isFormat);


    }

    public static boolean isFormatRight(String initials) {
        return (initials.charAt(1) == '.' && initials.charAt(3) == '.');
    }
}
