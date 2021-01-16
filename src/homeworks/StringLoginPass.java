package homeworks;

import java.util.Scanner;

public class StringLoginPass {
    public static void main(String[] args) {
        //Java String equals() Method Example 2
        // Write a password checker program that will check passwords and username from Scanner, or the user will put the passwords and username in there).
        //
        //The program will check these things for each password and username
        //1. a password must have at least characters 15 and username must be minimum 8.
        //
        //2. If it is entered correct then you found the password otherwise it should say it is incorrect password.
String correctLogin = "JohnDoe69@gmail.com";
String correctPass = "JohnsDoeHardP@$$";
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your login");
        String userLogin = sc.nextLine();
        System.out.println("Please enter your password");
        String userPass = sc.nextLine();
        if(userLogin.length()<8 || userPass.length()<15){
            System.err.println("Wrong input!");
        }
        else {
            if(userLogin.equals(correctLogin) && userPass.equals(correctPass)){
                System.out.println("Login successful!");
            } else if(userLogin.equals(correctLogin) && !userPass.equals(correctPass))  {
                System.err.println("Wrong pass");
            }
        }
    }
}
