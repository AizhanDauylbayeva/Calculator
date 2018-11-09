package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTest extends BaseCalcTest {
    @Test(dataProvider = "CtgDataProvider")
    public void testCtg(double a, double expected) {
        double ctg = calc.ctg(Math.toRadians(a));
        Assert.assertEquals(ctg, expected);
    }

    @DataProvider(name = "CtgDataProvider")
    public static Object[][] CtgDataProvider() {
        return new Object[][]{
                {30, 1.732050807568877},
                {45, 1},
                {60, 0.5773502691896258},
                {90, 0},
                {270, 0},
        };
    }
}
