package presentations;
import java.sql.SQLOutput;
import java.util.*;
public class PresentationScanner {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your age?");
//        while (!sc.hasNextInt()){
//            sc.nextLine();
//            System.out.println("only integers allowed. Try again");
//        }
//        int age = sc.nextInt();
//        System.out.println("You age is "+ age);

//        int arr[] = {2, 11, 45, 9};
//        for (int num : arr) {
//            System.out.println(num);
            for(int row = 1; row<=3;row++){
                for(int col=1; col<=5;col++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
