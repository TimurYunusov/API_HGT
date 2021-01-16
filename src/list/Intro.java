package list;


import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("BMW");
        firstList.add("Mercedes");
        firstList.add("Lambo");
        System.out.println(firstList);
        firstList.add(1,"Dodge");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        System.out.println(firstList.get(2));

    }
}
