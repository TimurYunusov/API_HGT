package homeworks;

import java.util.Scanner;

public class MethodDesign {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
System.out.println("Case 1: Please enter your length:");
        int l =sc.nextInt() ;
        System.out.println("Case 1: Please enter your width:");
        int w = sc.nextInt();
        System.out.println("Case 2: Please enter your length:");
        int a = sc.nextInt();
        System.out.println("Case 2: Please enter your width:");
        int b = sc.nextInt();
        System.out.println("Case 3: Please enter your length:");
        int c =sc.nextInt();
        System.out.println("Case 3: Please enter your width:");
        int d = sc.nextInt();

        perimeterAndArea(l,w);
        perimeterAndArea(a, b);
        perimeterAndArea(c, d);
    }

    public static void perimeterAndArea(int l, int w) {
        int perimeter = 2 * (l + w);
        int area = l * w;
        System.out.println("You perimeter is " + perimeter);
        System.out.println("Your area is " + area);
        return;
    }

   /* public static void Scanner1(int l, int w) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your length:");
        l = sc.nextInt();
        System.out.println("Please enter your width:");
        w = sc.nextInt();
        return; */
    }






