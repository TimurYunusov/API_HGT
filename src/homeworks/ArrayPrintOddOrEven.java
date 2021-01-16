package homeworks;

public class ArrayPrintOddOrEven {
    public static void main(String[] args) {
        //Given array (elements): 10 11 12 13 14
        //Output:
        //Odd numbers in the array are : 10 12 14
        //Even numbers in the array are : 11 13

        int[] array = {10,11,12,13,14};
        String odd= "";
        String even = "";
        for(int i = 0; i<array.length; i++){
            if(array[i] %2 == 0){
                even+= " "+ array[i];
            } else {
                odd += " " + array[i];
            }
        }
        System.out.println("Odd numbers in the array are: "+ odd);
        System.out.println("Even numbers in the array are: "+ even);
    }
}
