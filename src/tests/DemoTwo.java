package tests;

import junit.ClassesToTest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class DemoTwo {

    @Test
    @Ignore
    public void test1() {
        //fail
        System.out.println("Hello world");
        if (false) {
            Assert.fail("User logged in unsuccessful");
        } else {
            Assert.fail("No internet connection                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        }
        System.out.println("After fail");
        // we use this fail method in the set up part of the test

    }

    @Test
    public void assertEqualsMethodTest() {
        int result = 100 % 8;
        Assert.assertEquals("Modulo operation failere", 4, result);
        System.out.println();
    }

    @Test
    public void assertEqualsWithDouble() {
        double actualC = ClassesToTest.convertFtoC(80);
        Assert.assertEquals("Fahrenheit to Celsius converter failure", 26.67, actualC, 0.0);
    }

    @Test
    public void convertNegativeCase() {
        double actual = ClassesToTest.convertFtoC(-20);
        Assert.assertEquals("F to C converter failure in negative F", -28.89, actual, 0.0);
    }

    @Test
    public void convertNegativeCaseTest() {
        double actual = ClassesToTest.convertFtoC(0);
        Assert.assertEquals("F to C converter failure in negative F", -17.78, actual, 0.0);

    }
    @Test
    public void reverseArrayTest1(){
        String[] arr = {"Happy","World","123", "43253", "2332"};
        String actual = ClassesToTest.reversesArray(arr);
        Assert.assertEquals("Reverse array program failure", "2332 -> 43253 -> 123 -> World -> Happy",actual);
    }
    @Test
    public void reverseArrayTest2(){
        String[] arr = new String[4];
        String actual = ClassesToTest.reversesArray(arr);
        Assert.assertEquals("Reverse array program failure", "null -> null -> null -> null",actual);
    }
    @Test
    public void assertNull(){
                //some functionalities must return null
        String[] arr = new String[4];
        String actual = ClassesToTest.reversesArray(arr);
        Assert.assertNull("Reverse array program failure",actual);
    }
    @Test
    public void assertNotNull(){
        //some functionalities must return null
        String[] arr = {"12", "243"};
        String actual = ClassesToTest.reversesArray(arr);
        Assert.assertNotNull("Reverse array program failure", actual);
    }
    }
