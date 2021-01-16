package homeworks;

import java.util.Scanner;

public class WhileLoopEasy {
    public static void main(String[] args) {
 int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a message and I will display it 5 times!");
        String toDisplay = sc.nextLine();

        while (count<=5){
            System.out.println(count+". "+ toDisplay);
            count++;
        }
    }
}
