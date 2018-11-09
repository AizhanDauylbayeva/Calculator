package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseCalcTest {

    @Test(dataProvider = "SqrtDataProvider")
    public void testSqrt(double a, double expected) {
        double sqrt = calc.sqrt(a);
        Assert.assertEquals(sqrt, expected);
    }

    @DataProvider(name = "SqrtDataProvider")
    public static Object[][] SqrtDataProvider(){
        return new Object[][] {
                {4, 2 },
                {10, 3.1622776601683795 },
                {-16, 4 },
                {0.25, 0.5}
        };
    }
}
