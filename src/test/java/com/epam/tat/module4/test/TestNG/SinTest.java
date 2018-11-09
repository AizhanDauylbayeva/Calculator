package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseCalcTest {

    @Test(dataProvider = "SinDataProvider")
    public void testSin(double a, double expected) {
        double sin = calc.sin(Math.toRadians(a));
        Assert.assertEquals(sin, expected);
    }

    @DataProvider(name = "SinDataProvider")
    public static Object[][] SinDataProvider() {
        return new Object[][]{
                {0, 0.0},
                {30, 0.5},
                {45, 0.7071067811865475},
                {60, 0.8660254037844386},
                {90, 1.0},
                {180, 0.0},
                {270, -1.0},
                {360, 0.0},
        };
    }
}
