package homeworks;

import java.util.Arrays;

public class ArraysReverse {
    public static void main(String[] args) {
        //    Write a method called reverse(), which takes an array of int and reverse its contents. For example, the reverse of [1,2,3,4] is [4,3,2,1]. The method's signature is as follows:
        //
        //public static void reverse(int[] array)
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    public static void reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - (i + 1)];
        }
        System.out.println(Arrays.toString(reverse));
    }

}
