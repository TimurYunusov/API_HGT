package homeworks;

public class Assignment2b {
    public static void main(String[] args) {
        //a. -5 + 8 * 6   // you should declare first data types ==> int  a=-5; int b=8; c=6 ;    int result=a+b*c; System.out.println(result);
        //b. (55+9) % 9                                // try to declare data type first and print out the result
        //c. 20 + -3*5 / 8                             // try to declare data type first and print out the result
        //d. 5 + 15 / 3 * 2 - 8 % 3                // try to declare data type first and print out the result
        //Expected Output :
        //43
        //1
        //19
        //13

        int  a=-5, b=8, c=6;
        int result=a+b*c;

        int d=55, d1=9;
        int result2 = (d+d1)%d1;

        int e=20, e1=-3, e2=5;
        int result3=e+e1*e2/b;

        int f=15, f1=3, f2=2;
        int result4=e2+f/f1*f2-b%f1;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
