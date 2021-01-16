package list;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {

        int[] arr ={1,34,56,3};
        List<Integer>nums = new ArrayList<>();
        nums.add(123);
        nums.add(23);
        nums.add(1,2);
        nums.remove(new Integer(2));
 nums.remove(1);
        System.out.println(nums);
        List<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add("Cardinal");
        birds.add("Eagle");
        birds.add("Parrot");
        birds.add("Sparrow");

        birds.set(4,"Jack Sparrow");

        int indexOfParrot = birds.indexOf("Parrot");
        birds.set(indexOfParrot, "Talking Parrot");
        System.out.println(birds);
        birds.set(birds.indexOf("Hawk"), "Blackhawks");
        System.out.println(birds.size());
        birds.clear();
        System.out.println(birds);
        System.out.println(birds.size());
        birds.add("Hawk");
        birds.add("Cardinal");
        birds.add("Eagle");
        birds.add("Parrot");
        birds.add("Sparrow");
        System.out.println(birds);
        System.out.println(birds.contains("wk"));

        List<StringBuilder>sbList= new ArrayList<>();
        List<String> birds2 = new ArrayList<>(birds);
        System.out.println(birds2.equals(birds));

        List<String> birds3 = new ArrayList<>();
        birds3.add("Hawk");
        birds3.add("Cardinal");
        birds3.add("Eagle");
        birds3.add("Parrot");
        birds3.add("Sparrow");
        System.out.println(birds3.equals(birds2));
        System.out.println(birds.equals(birds3));
        System.out.println(birds.get(2));



    }
}
