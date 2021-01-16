package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingListToArray {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();
        nums.add(123);
        nums.add(34);
        nums.add(43);
        nums.add(43);
        System.out.println(nums);

        Integer[] numsArr = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numsArr));
        System.out.println(nums.get(1));

        String[] names = {"Elon Musk", "Steve Jobs", "B Franklin"};
        List<String> namesList  =Arrays.asList(names);
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);
        names[2]= "Bill Gates";
        System.out.println(namesList);

      //
        System.out.println(namesList);

        List<String>namesListDynamic = new ArrayList<>(namesList);
        System.out.println(namesListDynamic);
        namesListDynamic.add(1,"Jeff Bezos");
        System.out.println(namesListDynamic);




    }
}
