package tests.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({FirstTest.class, AssertDemo2.class, DemoTwo.class, SecondTestClass.class, TestMoveElement.class})

public class SmokeTestRunner {
@BeforeClass
    public static void beforeAll(){
    System.out.println("Selenium open chrome");
    System.out.println("Selenium go to amazon.com");
    System.out.println("Selenium make sure my window is maximized");
}
@AfterClass
    public static void tearUp(){
    System.out.println("Close the browser");
    System.out.println("Clean the mess you made");
}

}
