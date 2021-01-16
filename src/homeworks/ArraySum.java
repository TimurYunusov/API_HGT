package homeworks;

public class ArraySum {
    public static void main(String[] args) {
        //int arr[]={ 1,2,3,4 }
        //
        //Can you find sum of all elements of array by using for loop?
        //
        //Example: 1+2+3+4=10

        int[] arr = {1, 2, 3, 4, 8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + "+");
            }
        }
        System.out.print("=" + sum);
    }
}
