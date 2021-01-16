package homeworks;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        System.out.println(fib(n));

    }
    public static int fib(int n){
        int fibSum = 0;
        int[] fib = new int[n];
        fib[0]=0;
        fib[1]=1;
        for(int i = 2; i<n; i++){
            fib[i]= fib[i-1] + fib[i-2];
        }
        return fib[n-1];
    }
}
