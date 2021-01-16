package arrays;

import java.util.Arrays;

public class BinarySearchCharsandStrings {
    public static void main(String[] args) {
        char[] chicagoBullsStats= {'W','W','l','D','D','W','L','L'};
        Arrays.sort(chicagoBullsStats);
        System.out.println(Arrays.binarySearch(chicagoBullsStats, 'L'));
        String[] companies = {"Amazon","Apple","Facebook","Google", "Tesla Motors", "Toyota"};
        Arrays.sort(companies);
        String tesla =companies[(Arrays.binarySearch(companies, "Tesla Motors"))];
        companies[(Arrays.binarySearch(companies, "Tesla Motors"))]=tesla.replace("Motors","");
        System.out.println(Arrays.toString(companies));
    }
}
