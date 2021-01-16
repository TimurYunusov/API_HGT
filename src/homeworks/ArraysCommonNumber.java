package homeworks;

public class ArraysCommonNumber {
    public static void main(String[] args) {
        //Array1 : [1, 2, 5, 5, 8, 9, 7, 10]
        //Array2 : [1, 0, 6, 15, 6, 4, 7, 0]
        //Common element is : 1
        //Common element is : 7

        int[] Array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] Array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        for(int i = 0; i<Array1.length; i++){
            for(int j =0; j<Array1.length; j++){
                if(Array1[i] == Array2[j]){
                    System.out.println(" Common element is : " + Array1[i]);
                }

            }
        }

    }
}
