package arithmetic_operators;

public class ConditionalOperations {
    public static void main(String[] args) {
        //you are checking for someones age
        //we can only have age between 0 and 100
        int age = 56;
        boolean isValidAge = age >= 0 && age <=100;
        System.out.println(isValidAge);
        String userNameSavedInDB = "JohnDoe";
        String userPasswordSavedInDB = "ExtraHard";
        String usernameEntered = "JohnDoe";
        String userPasswordEntered ="ExtraHard";
        boolean allowToLogin = userNameSavedInDB == usernameEntered && userPasswordSavedInDB == userPasswordEntered;
        System.out.println("user name in DB: " + userNameSavedInDB);
        System.out.println("user name Entered: " + usernameEntered );
        System.out.println("user pass in DB: " + userPasswordSavedInDB);
        System.out.println("user pass Entered: " + userPasswordEntered);
        System.out.println("Login success? " + allowToLogin);

        int i =0;
        int x =1;
        boolean result = i<x || x++ >i;
        System.out.println(x);
        System.out.println(result);

        int a =0;
        int y =1;
        boolean result1 = a >y && a++ >i;
        System.out.println(result1);
        System.out.println(a);

    }
}
