package arithmetic_operators;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
       sc.nextLine(); //eating the line so next time you call scanner it will start from the fresh line
       String text = sc.nextLine();
       double e = sc.nextDouble();
        // double max = a > b && a > c ? a : (b>c ? b : c);  //that would be enough but I wanted to play around
        double max1 = Math.max(Math.max(a,b), c);
        System.out.println("The greatest: " + max1);
        System.out.println(e + text);


    }
}
