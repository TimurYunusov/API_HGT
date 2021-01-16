package homeworks;

public class LoopsFibonacciNumbers {
    public static void main(String[] args) {
      //  Print out first 10 fibonacci numbers.
    //    1 1 2 3 5 8 13 21 34 55
int n1 = 1, n2 =1,n3;
        System.out.print(n1 + " " +n2);
        for(int i=2;i<10;++i){
            n3= n1+n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
        }
    }
}
