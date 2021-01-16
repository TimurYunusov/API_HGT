package homeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListsFirst {
    public static void main(String[] args) {
        // //write a method which takes an List<Integer>
        //    //and returns an int which is the sum of two biggest values(elements) can be duplicates
        //    //ex: [145,4,-10,13,44,3,0]
        //    //189
        //    //145+44 = 189;
        //    //ex: [50,4,50,13,44,3,0]
        //    //100
        //    //50+50 = 100;
        //
        //    //1. solve using sort.
        //    //2. solve without using sort.
List <Integer> intList = new ArrayList<>();
intList.add(12);
        intList.add(23);
        intList.add(2);
        intList.add(45);
        intList.add(64);
        intList.add(45);

        List <Integer> intList2 = new ArrayList<>();
        intList2.add(422);
        intList2.add(323);
        intList2.add(345);
        intList2.add(453);
        intList2.add(164);
        intList2.add(425);
              System.out.println(sumOfTwoBiggestNumbersInAListWithSortMethod(intList));
sumOfTwoBiggestNumbersInAListWithoutSortMethod(intList2);

    }
    public static int sumOfTwoBiggestNumbersInAListWithSortMethod(List<Integer> intList){
        Collections.sort(intList);
        System.out.println(intList);
       // if(l.get(l.size()-1)!=l.get(l.size()-2)){
            return intList.get(intList.size()-1)+intList.get(intList.size()-2);
     //   }
    }
    public static int sumOfTwoBiggestNumbersInAListWithoutSortMethod(List<Integer>intList){


        int biggest=0;
        int temp=0;
        int secondBiggest=0;
        for(int i = 0; i<intList.size();i++){
            for(int j=i+1; j<intList.size();j++){
                if(intList.get(i) < intList.get(j)){
                   biggest = intList.get(j);

                } else if(intList.get(i) < intList.get(j)&& intList.get(j) <biggest){
                    secondBiggest=intList.get(j);
                }
            }
        }
        System.out.println(biggest + " sds " + secondBiggest);
        System.out.println(intList);
        return 0;
    }
}
