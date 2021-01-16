package tests;

import org.junit.Test;

public class SecondTestClass {
    @Test

    public void firstMethodTest(){
        //body -> work
        //we can put anything
        System.out.println("Hello world");

    }

    @Test
    public void secondMethodTest(){
        System.out.println("Test 2");
    }
@Test
    public void helloTest(){
    System.out.println("Hello Test method.");
}

@Test
    public void abc(){
        int i =20;
        int sum =i+2;
        String str = "";
   // System.out.println(str.charAt(2));
    System.out.println("ABC "+ sum);
}
}
