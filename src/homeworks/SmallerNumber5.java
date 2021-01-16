package homeworks;

import java.util.Scanner;

public class SmallerNumber5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        int d = sc1.nextInt();
        int e = sc1.nextInt();

        int smallerNumber = a<b && a<c && a<d && a<e ? a: (b<c && b<d && b<e) ? b: (c<d && c<e) ? c: (d<e ? d : e);
        System.out.println("The Smallest number is : "+ smallerNumber);


    }
}
