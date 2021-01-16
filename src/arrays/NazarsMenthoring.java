package arrays;

import java.util.Arrays;

public class NazarsMenthoring {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getUnique(new String[]{"Hello", "Hello", "world", "world", "a", "musk"})));
    }

    //return an array that contains only unique values from given array
    public static String[] getUnique(String[] arr){
        //1) We don't know the size of the array
        String s = ""; // separate by space
        for(int i = 0; i < arr.length; i++){
            String cur =arr[i];
           if(!s.contains(cur)) s=s.concat(cur).concat(" ");
        }
        return s.split(" ");
    }
}
