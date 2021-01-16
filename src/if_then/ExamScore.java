package if_then;

import java.util.Scanner;

public class ExamScore {
    public static void main(String[] args) {
       /* int score = 80;
        if (score>69 && score<101) {
            System.out.println("Great! You passed the exam!");
        }
        if(score <70 && score <101) {
            System.out.println("Try again! Keep working hard!");
        }
*/
        //Tell me if the temperature outside is too hot
        //print out "Too Hot" if the temp is hotter than 80F
        //Turn on your AC
        //if less 30 say Freaking Cold Chicago.
        //Miami wait for me


System.out.println("Enter Temperature: ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp>=80){
            System.out.println("Too Hot");
            System.out.println("Turn ON your AC");
        }
       else if(temp<=30) {
            System.out.println("Freaking cold Chicago! ");
            System.out.println("Miami wait for me");
            System.out.println("But for now turn on heat");
        }
        else if (temp > 30 && temp < 80) {
            System.out.println("Let's have a picnic");
        }
         else {
            System.out.println("Wrong input");
        }

    }
}
