package arrays;

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int[] arr = {3,4,7,2,6,1,8,0,9,5};
        System.out.println(arr +"");
        System.out.println(Arrays.toString(sortOfSorter(arr)));
    }
    public static int[] sortOfSorter(int[] arr){
        int[] sorted = new int[arr.length];
        int index=0;
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    index++;
                }
            }
            sorted[index] = arr[i];
        }return sorted;
    }
}
