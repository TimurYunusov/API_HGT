package tests;

import list.MoveToEnd;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class TestMoveElement {
    // check if one targeted value was moved to the end in an unsorted arraylist
    // we don't want to change the order of the whole array,
    // but we want to swap only the targeted value and the value at the end of the
    // list in this case.
    // @Test annotation works only with methods, so it'll complain if you don't
    // put a method underneath it.
    @Test
    public void oneValueWasMovedToEndTest(){
        // All tests will have three sections:
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(88);
        nums.add(50);
        nums.add(-100);
        nums.add(10);
        // 99, 88, 50, -100, 10 -> given
        // 99, 10, 50, -100, 88 -> expected
        int target = 88;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(99);
        expected.add(10);
        expected.add(50);
        expected.add(-100);
        expected.add(88);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void allElementsNeededMovedTest(){
        //check if all targeted elements moved to the end of arraylist
        //all targeted values has been swapped with the element from the end of the list if the
        //
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(0);
        nums.add(55);
        nums.add(0);
        nums.add(10);
        nums.add(80);
        nums.add(65);
        nums.add(0);
        nums.add(80);
        nums.add(10);
        // 99, 0, 55, 0, 10, 80, 65, 0, 80, 10 -> given
        // 99, 10, 50, 80, 10,80, 65, 0, 0, 0 -> expected
        int target = 0;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(99);
        expected.add(10);
        expected.add(55);
        expected.add(80);
        expected.add(10);
        expected.add(80);
        expected.add(65);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void matchAtTheEnd(){
        //check if all targeted elements moved to the end of arraylist
        //all targeted values has been swapped with the element from the end of the list if the
        //
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(947);
        nums.add(54);
        nums.add(10);

        // 99, 0, 55, 0, 10, 80, 65, 0, 80, 10 -> given
        // 99, 10, 50, 80, 10,80, 65, 0, 0, 0 -> expected
        int target = 10;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(54);
        expected.add(947);
        expected.add(10);
        expected.add(10);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void oneElementInTheListTest(){
        //check if all targeted elements moved to the end of arraylist
        //all targeted values has been swapped with the element from the end of the list if the
        //
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);

        // 99, 0, 55, 0, 10, 80, 65, 0, 80, 10 -> given
        // 99, 10, 50, 80, 10,80, 65, 0, 0, 0 -> expected
        int target = 10;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();

        expected.add(10);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void wrongTargetTest(){
        //check if all targeted elements moved to the end of arraylist
        //all targeted values has been swapped with the element from the end of the list if the
        //
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);

        // 99, 0, 55, 0, 10, 80, 65, 0, 80, 10 -> given
        // 99, 10, 50, 80, 10,80, 65, 0, 0, 0 -> expected
        int target = 50;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();

        expected.add(10);
        Assert.assertEquals(expected,actual);

    }
}