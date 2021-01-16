package list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MoveToEnd {
    public static void main(String[] args) {

    }
    public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            while (array.get(j) == toMove) {
                j--;
            }
            if (array.get(i) == toMove) {
                int temp = array.get(j);
                array.set(j, array.get(i));
                array.set(i, temp);
            }
            i++;
        }
        return array;

    }
    public class moveElementToEnd{
        //check if one targeted int were moved to the end in an unsorted arraylist
        //@test annotation works only with methods, so it'll complain if you don't
        //put a method underneath it

        @Test
        public void oneValueWasMovedToEndTest(){
            //all tests will have 3 sections
            //1. set up (precondition for test)
            //I have sth to execute, but b4 doing that, I need sth to
            //2. execution
            //3. validation

            //Setup
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(99);
            nums.add(88);
            nums.add(50);
            nums.add(-100);
            nums.add(10);
            //execution
           List<Integer> actual= moveElementToEnd(nums, 88);
           //validation
            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(99);
            expected.add(50);
            expected.add(-100);
            expected.add(10);
            expected.add(88);

            Assert.assertEquals(expected,actual);


        }

    }

}