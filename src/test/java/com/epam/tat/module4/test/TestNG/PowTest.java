package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseCalcTest {
    @Test(dataProvider = "PowDataProvider")
    public void testPow(double a, double b, double expected) {
        double pow = calc.pow(a, b);
        Assert.assertEquals(pow, expected);
    }

    @DataProvider(name = "PowDataProvider")
    public static Object[][] PowDataProvider(){
        return new Object[][] {
                {2, 3, 8 },
                {0, 2, 0 },
                {-3, 3, -27 },
                {0.1, 2, 0.01 },
                {5, 0.2, 1.3797296615 }
        };
    }
}
