package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintArrayinStars {
    public static void main(String[] args) {
        //PrintArrayInStars (Array)
        //Write a program called printArrayInStars which prompts user for the number of items in an array
        // (a non-negative integer), and saves it in an int variable called numItems. It then prompts user
        // for the values of all the items (non-negative integers) and saves them in an int array called items.
        // The program shall then print the contents of the array in a graphical form,
        // with the array index and values represented by number of stars. For examples,
        //
        //Enter the number of items: 5
        //Enter the value of all items (separated by space): 7 4 3 0 7
        //0: *******(7)
        //1: ****(4)
        //2: ***(3)
        //3: (0)
        //4: *******(7)
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int numItems = sc.nextInt();
        System.out.println("Enter the value of all items (separated by space):");
        int[] items = new int[numItems];
        for (int i = 0; i < items.length; i++) {

            items[i] = sc.nextInt();
        }


        for (int idx = 0; idx < items.length; ++idx) {  // row

            System.out.println();
            System.out.print(idx + ": ");

            for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
                System.out.print("*");
                if (starNo == items[idx]) {
                    System.out.print("(" + items[idx] + ")");
                }

            }
        }

    }
}
