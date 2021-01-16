package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] messiGoalsInLastDecadePerYear ={47, 53 ,73 ,60,41,58,41,54,45,51,30};
        Arrays.sort(messiGoalsInLastDecadePerYear);
        int index = Arrays.binarySearch(messiGoalsInLastDecadePerYear, 54);
        System.out.println(index);
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear, 47));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear, 41));
        Arrays.sort(messiGoalsInLastDecadePerYear);
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear, 42));
    int[] arr = {12,323,4,44,45,6,6,57,-54,65,-5,-67,886,74};
    Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,1));
    }
}
