package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseCalcTest {
    @Test(dataProvider = "TgDataProvider")
    public void testCos(double a, double expected) {
        double tg = calc.tg(Math.toRadians(a));
        Assert.assertEquals(tg, expected);
    }

    @DataProvider(name = "TgDataProvider")
    public static Object[][] TgDataProvider() {
        return new Object[][]{
                {0, 0},
                {30, 0.5773502691896258},
                {45, 1},
                {60, 1.732050807568877},
                {180, 0},
                {360, 0}
        };
    }
}
