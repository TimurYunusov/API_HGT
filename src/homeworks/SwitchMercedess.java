package homeworks;

import java.util.Scanner;

class SwitchMercedes {
    public static void main(String[] args) {
        ////Mercedes -> C,E,S,G
        //        //        ///Ask a user to choose a class
        //        //        //C class should list "C230", "CLK320", "C65 AMG".
        //        //        //E class should list "E350", "E55 AMG", "E65 AMG"
        //        //        //S class should list "S500", "S550", "S65 AMG"
        //        //        //G class should list "G550" ,"G63 AMG", "G65 AMG"
        //        //        //if not a valid class say unsupported Mercedes Class.
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mercedes Benz dealership! Please enter class you are looking for:");
        char classOfMercedes = sc.next().charAt(0);
        switch (Character.toLowerCase(classOfMercedes)) {
            case 'c':
                System.out.println("We have couple options for you: \n 1. C230 \n 2. CLK320 \n 3. C65 AMG");
                break;
            case 'e':
                System.out.println("We have couple options for you: \n 1. E350 \n 2. E55 AMG \n 3. E65 AMG");
                break;
            case 's':
                System.out.println("We have couple options for you: \n 1. S500 \n 2. S550 \n 3. S65 AMG");
                break;
            case 'g':
                System.out.println("We have couple options for you: \n 1. G550 \n 2. G63 AMG \n 3. G65 AMG");
                break;
            default: System.out.println("Unsupported Mercedes Class");



        }
    }
}
