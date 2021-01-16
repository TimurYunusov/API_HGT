package homeworks;

public class CubeOfNumber {
    public static void main(String[] args) {

        //Expected Output :
        //
        //Number is : 1 and cube of 1 is : 1
        //Number is : 2 and cube of 2 is : 8
        //Number is : 3 and cube of 3 is : 27
        //Number is : 4 and cube of 4 is : 64

        int a = 1;
        while(a<=4) {
            System.out.println("Number is : "+a +" and cube of "+a+ " is: "+a*a*a);
            a++; }
     }
}
