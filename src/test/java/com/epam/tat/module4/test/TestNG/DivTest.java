package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest extends BaseCalcTest {

    @Test(dataProvider = "DivDataProvider")
    public void testDiv(long a, long b, long expected) {
        long div = calc.div(a, b);
        Assert.assertEquals(div, expected);
    }

    @DataProvider(name = "DivDataProvider")
    public static Object[][] DivDataProvider(){
        return new Object[][] {
                {10, 5, 2 },
                {10, 10, 1 },
                {-4, -2, 2 },
                {0, 2, 0 }
        };
    }

    @Test(dataProvider = "DivDoubleDataProvider")
    public void testDivDouble(double a, double b, double expected) {
        double div = calc.div(a, b);
        Assert.assertEquals(div, expected);
    }

    @DataProvider(name = "DivDoubleDataProvider")
    public static Object[][] DivDoubleDataProvider(){
        return new Object[][] {
                {10.2, 2, 5.1 },
                {10, -2.5, -4 },
                {0.8, 0.4, 2 }
        };
    }

}
