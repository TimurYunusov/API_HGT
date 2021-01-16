package homeworks;

public class SsnFinder {
    public static void main(String[] args) {
        //   //#5 find a method which printout the word that contains 11 characters given a tree word String then return true.
        //#6 you will return true only if the one of the words are in ssn format(ddd-dd-dddd);
        String information = "James 344-54-5566 Number";
        //ssnFinder(information);
        System.out.println(ssnFinder(information));

    }

    public static boolean ssnFinder(String information) {
        int indexOfSpace = information.indexOf(" ");
        String ssn = information.substring(indexOfSpace, indexOfSpace + 11).trim();
        System.out.println("SSN is : " + ssn);
        if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
            return true;
        } else {
            return false;
        }
    }
}
