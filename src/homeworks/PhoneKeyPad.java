package homeworks;

import java.util.Locale;
import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        //PhoneKeyPad (String & char)
        //On your phone keypad, the alphabets are mapped to digits as follows: ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9). Write a program called PhoneKeyPad,
        // which prompts user for a String (case insensitive), and converts to a sequence of keypad digits. Use (a) a nested-if, (b) a switch-case-default.


        Scanner sc = new Scanner(System.in);
        String inPut = sc.nextLine().toLowerCase();

        int l = inPut.length(); //many times loop will be run

        for (int i = 0; i < l; i++) {
            String numbers = "";
            switch (inPut.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    numbers = 2 + "";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    numbers = 3 + "";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    numbers = 4 + "";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    numbers = 5 + "";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    numbers = 6 + "";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    numbers = 7 + "";
                    break;
                case 't':
                case 'u':
                case 'v':
                    numbers = 8 + "";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    numbers = 9 + "";
                    break;
            }
            System.out.print(numbers);
        }


    }
}
