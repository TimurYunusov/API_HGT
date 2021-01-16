package tests;

import junit.ClassesToTest;
import org.junit.Assert;
import org.junit.Test;

public class AssertionsDemo {

    @Test
    public void bonusUnder5YearsServiceTest() {
        double bonus = ClassesToTest.calculateBonus(3, 100000);
        System.out.println(bonus);
        if (bonus != 5000) {
            Assert.fail();
        }
    }

    @Test
    public void bonusAbove5yearsServiceTest() {
        double bonus = ClassesToTest.calculateBonus(7, 100000);
        if (bonus != 10000) {
            Assert.fail();
        }
        double bonus2 = ClassesToTest.calculateBonus(6, 100000);
        if (bonus2 != 10000) {
            Assert.fail();
        }
        double bonus3 = ClassesToTest.calculateBonus(8, 100000);
        if (bonus3 != 10000) {
            Assert.fail();
        }

    }

    @Test
    public void bonus7yearsServiceTest() {
        double bonus2 = ClassesToTest.calculateBonus(6, 100000);
        if (bonus2 == 10000) {
            Assert.fail();
        }

    }
@Test
    public void bonusTest10Years(){
        double bonus = ClassesToTest.calculateBonus(10,100000);{
            Assert.assertEquals(10000,bonus,0.0);
    }

}

}





