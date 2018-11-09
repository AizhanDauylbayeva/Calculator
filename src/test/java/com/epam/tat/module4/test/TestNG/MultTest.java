package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTest extends BaseCalcTest {

    @Test(dataProvider = "MultDataProvider")
    public void testMult(long a, long b, long expected) {
        long mult = calc.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    @DataProvider(name = "MultDataProvider")
    public static Object[][] MultDataProvider(){
        return new Object[][] {
                {10, 5, 50 },
                {10, -2, -20 },
                {-4, -2, 8 },
                {0, 2, 0 }
        };
    }

    @Test(dataProvider = "MultDoubleDataProvider")
    public void testMultDouble(double a, double b, double expected) {
        double mult = calc.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    @DataProvider(name = "MultDoubleDataProvider")
    public static Object[][] MultDoubleDataProvider(){
        return new Object[][] {
                {10.2, 2, 20.4 },
                {10, -2.5, -25 },
                {-2.4, 1, -2.4 },
                {0.8, 0.4, 0.32 }
        };
    }

}
