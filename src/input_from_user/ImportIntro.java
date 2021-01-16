package input_from_user;

import java.util.Scanner;

public class ImportIntro {
    public static void main(String[] args) {
     //Scanner class comes from JDK U can name it sc/input/scanner
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
System.out.println(num);

Scanner input = new Scanner(System.in);
String address = input.nextLine();
char gender = input.next().charAt(0);


    }
}
