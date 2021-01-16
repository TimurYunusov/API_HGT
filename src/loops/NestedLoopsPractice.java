package loops;

import java.util.Scanner;

public class NestedLoopsPractice {
    public static void main(String[] args) {
        //write A function which checks if each character in the
        //String has at least one  duplicate character.
        //Abba = true;
        //noon = true;
        //caucasus = true
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String str = sc.nextLine();

        System.out.println(duplicate(str));
        System.out.println("Hello " + duplicate("Hello"));
        System.out.println("abba " + duplicate("Abba"));
        System.out.println("noon " + duplicate("noon"));
        System.out.println("caucasus " + duplicate("caucasus"));
        System.out.println("happpynewyear " + duplicate("happpynewyear"));


    }

    public static boolean duplicate(String str) {
        int l = str.length();
        String str1 = str.toLowerCase();
        int counter = 0;
      if(l%2 !=0){
           return false;
      } else {
           for (int i = 0; i < l; i++) {
               for (int j = i + 1; j < l; j++) {
                   if (str1.charAt(i) == str1.charAt(j)) {
                       counter++;
                   }
               }
           }
           //System.out.println(counter);
           if (counter == l / 2) {
               return true;
           }
           return false;
       }
    }
}