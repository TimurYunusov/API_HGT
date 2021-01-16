package homeworks;

import java.util.Locale;

public class StringToUpperCase {
    public static void main(String[] args) {
        //Please write your first and last name in lower letters then your program should change it to first letter only to upper letter.
        //
        //Ex: akilay    --> Akilay
        //
        //       maratov--> Maratov

        String firstName= "timur";
        String lastName = "yunusov";
        String firstToReturn = firstName.substring(0,1).toUpperCase(Locale.ROOT)+firstName.substring(1);
        String lastToReturn = lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1);
        System.out.println(firstName+ " --->  " + firstToReturn);
        System.out.println(lastName+ " --->  " + lastToReturn);

    }
}
