package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiTest extends BaseCalcTest{
    @Test(dataProvider = "MultiDataProvider")
    public void testMulti(long a, long b, long expected) {
        long Multi = calc.mult(a, b);
        Assert.assertEquals(Multi, expected);
    }

    @DataProvider(name = "MultiDataProvider")
    public static Object[][] MultiDataProvider(){
        return new Object[][] {
                {10, 5, 50 },
                {10, -2, -20 },
                {-4, -2, 8 },
                {0, 2, 0 }
        };
    }

    @Test(dataProvider = "MultiDoubleDataProvider")
    public void testMultiDouble(double a, double b, double expected) {
        double mult = calc.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    @DataProvider(name = "MultiDoubleDataProvider")
    public static Object[][] MultiDoubleDataProvider(){
        return new Object[][] {
                {10.2, 2, 20.4 },
                {10, -2.5, -25 },
                {-2.4, 1, -2.4 },
                {0.8, 0.4, 0.32 }
        };
    }
}
