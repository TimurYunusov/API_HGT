package arrays;


    import java.util.Arrays;
public class T4 {
        public static void main(String[] args) {
            // for each loop iterates values not indexes
            System.out.println(Integer.MAX_VALUE);
            int[] arr = {1, 5, 7, 9, 4, 6, 14, 14};
            System.out.println(getSecondLargest(arr));
        }
        // [1, 5, 7, 9, 4, 6, 14, 14]
        // Find the largest int in int[]
        public static int findMax(int[] arr) {
            if(arr.length == 0) return Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            //
            for (int i : arr) {
                if(i > max) max = i; // If current is larger than stored maximum, assign current to max variable
            }

            return max;
        }

        public static int getSum(int[] arr) {
            int sum = 0;
            // 3 values
            // 1) declaration of a reference, should the same type as the array
            // 2 ) : syntax
            // 3) specify the collection
            for(int number : arr) {
                sum += number;
            }
            return sum;
        }

        // Return a second largest integer form an array
        public static int getSecondLargest(int[] arr) {
            if(arr.length == 0) return Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            int secMax = Integer.MIN_VALUE;
            //
            for (int i : arr) {
                if(i > max){
                    secMax = max;// If larger number found, set secMax to current max
                    max = i; // If current is larger than stored maximum, assign current to max variable
                    continue;
                }
                if(i > secMax && i < max) secMax = i;
            }
            return secMax;
        }
    }

