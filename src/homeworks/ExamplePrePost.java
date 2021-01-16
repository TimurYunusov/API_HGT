package homeworks;

public class ExamplePrePost {
    public static void main(String[] args) {
        int y = 11;
        int x = 9;
        int m = 100;
        int n = 200;
        --y; //after this line value will be changed to 10
        ++x; //after this line value will be changed to 10
        m--;//after this line value will be changed to 99
        n++;//after this line value will be changed to 201
        System.out.println(y);
        System.out.println(x);
        System.out.println(m);
        System.out.println(n);
        //and here we are sending to output all updated values.

    }
}
