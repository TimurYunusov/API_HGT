package homeworks;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {


        int[] arr = new int[]{3, 5, 6, 9, 2, 3, 1, 6};
        arraySorter(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] arraySorter(int[] arr) {
        //we will use nested for loops to compare all elements to find smaller one
        // we will create temp int to store current value of arr[i]
        // then we reassign arr[i] with smaller element we found so far and then put temp on arr[j]


        int temp = 0;
        // int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;


    }
}
