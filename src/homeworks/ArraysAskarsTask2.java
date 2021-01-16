package homeworks;

import java.util.Arrays;

public class ArraysAskarsTask2 {
    public static void main(String[] args) {
        //HW: write a function which takes int, double or String array.
        //as a first param, and takes an int for defining a starting point
        //and another int for defining end point.

        //(int[] arr, int start, int end)

        //in order to avoid IndexOutOfBound exception
        //printout("Invalid start or invalid end) if start or end are out of index range

        //task to return a String of elements from start until end(exclusive)

        //ex: int[] numsArr = {12,43,654,56723,12,1,0,-12,-324};
        //method(numsArr,3,6) => [56723,12,1];
        int[] arr = {12,124,87,96,352,655,46,48,16};
        System.out.println(arrayCutter(arr,3,8));

        String[] arr1 = {"Liverpool", "Barcelona", "Real", "Athletic", "Arsenal","Roma" };
        System.out.println(arrayCutter(arr1,1,4));

    }
    public static String arrayCutter(int arr[],int start, int end ){
        int l = arr.length;
        String toReturn = "";
        if(start<0 || end >l-1 || start>=end){
            System.out.println("Invalid start or invalid end");
        } else {
            int[] cut = new int[end-start];
            for(int i = 0; i<end-start; i++){
                cut[i] = arr[start+i];
                toReturn = Arrays.toString(cut);
              //  toReturn = toReturn.substring(1,toReturn.length()-1);
              //  toReturn = "[" + toReturn + "]";

            }
        }return toReturn;
    }
    public static String arrayCutter(double arr[],int start, int end ){
        int l = arr.length;
        String toReturn = "";
        if(start<0 || end >l-1 || start>=end){
            System.out.println("Invalid start or invalid end");
        } else {
            double[] cut = new double[end-start];
            for(int i = 0; i<end-start; i++){
                cut[i] = arr[start+i];
                toReturn = Arrays.toString(cut);
              //  toReturn = toReturn.substring(1,toReturn.length()-1);
              //  toReturn = "[" + toReturn + "]";

            }
        }return toReturn;
    }
    public static String arrayCutter(String arr[],int start, int end ){
        int l = arr.length;
        String toReturn = "";
        if(start<0 || end >l-1 || start>=end){
            System.out.println("Invalid start or invalid end");
        } else {
            String[] cut = new String[end-start];
            for(int i = 0; i<end-start; i++){
                cut[i] = arr[start+i];
                toReturn = Arrays.toString(cut);
               // toReturn = toReturn.substring(1,toReturn.length()-1);
             //   toReturn = "[" + toReturn + "]";

            }
        }return toReturn;
    }
}
