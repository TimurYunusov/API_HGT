package homeworks;

public class ArrayCanYouChange {
    // Driver method
    public static void main(String args[]) {
        int arr[] = {3, 1, 2, 5, 4};

        // passing array to method m1
        sum(arr);
        System.out.println("sum of array values : " + sum(arr));
    }

    public static int sum(int[] arr) {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }

}