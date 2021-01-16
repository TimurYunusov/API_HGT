package tests;

import org.junit.*;

public class JunitDemo {
    @Ignore
    @Test
    public void test1(){
        System.out.println("Test 1");
        Assert.fail();

    }

    @Before //it doesn't matter where @before is written under the tests or in a middle on a tests
   //but best practise is to put it in front of all tests
    public void beforeHook(){
        System.out.println("Before");
    }

    @Test(timeout = 1000)
    public void test2() throws InterruptedException {
        System.out.println("Test 1");
        Thread.sleep(2000);
    }
@Test
    public void test3(){
    System.out.println("Test 3");
}
    @After
    public void afterHook(){
        System.out.println("After Method");
    }
    @BeforeClass
    public static void beforeClassHook(){
        System.out.println("Before Class");
    }
}
