package presentations;
import java.util.*;
public class HasNextMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        while (!sc.hasNextLine()) {
            sc.nextLine();
            System.out.println("Only text allowed. Try again");
        }
        String name =sc.nextLine();
        System.out.println("Your name is " + name);
        int age =58;
        int x =age%20;
        System.out.println(x);
    }
}
