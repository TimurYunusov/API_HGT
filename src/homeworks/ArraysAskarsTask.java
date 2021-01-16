package homeworks;

import java.util.Arrays;

public class ArraysAskarsTask {
    public static void main(String[] args) {
        int arr[] = {34, 432, 324, 87, 211, 5, 3, 7, 954, 89};
        System.out.println(arrayToString(arr));
        double arr1[] = {34.56, 432.65, 32.47, 87.78, 211.25};
        System.out.println(arrayToString(arr1));
        String animal[] = {"Beetle", "Horse", "Cat"};
        System.out.println(arrayToString(animal));


    }

    public static String arrayToString(int[] arr) {
        int l = arr.length;
        int[] numbersToReturn = new int[l];
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l - 1; j++) {
                numbersToReturn[i] = arr[(l - 1) - i];
            }
        }
        String returned = Arrays.toString(numbersToReturn);
        returned = returned.replaceAll(",", " -> ");
        returned = returned.substring(1, returned.length() - 1);
        return returned = "<" + returned + ">";

    }

    public static String arrayToString(double[] arr) {
        int l = arr.length;
        double[] numbersToReturn = new double[l];
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l - 1; j++) {
                numbersToReturn[i] = arr[(l - 1) - i];
            }
        }
        String returned = Arrays.toString(numbersToReturn);
        returned = returned.replaceAll(",", " -> ");
        returned = returned.substring(1, returned.length() - 1);
        return returned = "<" + returned + ">";
    }

    public static String arrayToString(String[] arr) {
        int l = arr.length;
        String[] numbersToReturn = new String[l];
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l - 1; j++) {
                numbersToReturn[i] = arr[(l - 1) - i];
            }
        }
        String returned = Arrays.toString(numbersToReturn);
        returned = returned.replaceAll(",", " -> ");
        returned = returned.substring(1, returned.length() - 1);
        return returned = "<" + returned + ">";
    }
}