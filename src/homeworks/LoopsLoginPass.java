package homeworks;

import java.util.Scanner;

public class LoopsLoginPass {
    public static void main(String[] args) {
        //HomeWork -> Create two Strings one for username
        //        //second for password
        //
        //        //String username = "JohnDoe@tesla.com"
        //        //String password = "HardP@$$"
        //
        //        //create a program which takes input fro username and pass from user(scanner).
        //
        //        //check if username and password are valid(match). -> if they are valid -> say Logged in.
        //        //if the user enters the invalid password 3 times. We dont count invalid User name inputs.
        //        //Print out account is blocked.
        //        //Hint: use Do while.
        String username = "JohnDoe@tesla.com";
        String password = "HardP@$$";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your login bellow: ");
        String loginInput = sc.nextLine().trim();
        System.out.println("Please enter your password bellow: ");
        String passwordInput = sc.nextLine().trim();
        int counter = 0;
        int userNameCounter=0;
        boolean isLoggedIn =false;
        do {
            if(loginInput.equals(username) && passwordInput.equals(password)){
                System.out.println("Welcome back!");
                isLoggedIn=true;
                //System.exit(1);
            }
            else if (!username.equals("JohnDoe@tesla.com")){
                userNameCounter++;
            }
            else if(!passwordInput.equals(password)){
                System.err.println("Error! Try again: " + (2-counter) + " attempts left");
                if(2-counter==0){
                    System.err.println("We have to block your account, try again tomorrow");
                    System.exit(2);
                } else {
                    passwordInput = sc.nextLine();
                    counter++;
                }
            }

        } while (!isLoggedIn && counter<3 && userNameCounter<5);


    }
}
