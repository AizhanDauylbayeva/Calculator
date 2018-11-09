package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BaseCalcTest {

    @Test(dataProvider = "CosDataProvider")
    public void testCos(double a, double expected) {
        double cos = calc.cos(Math.toRadians(a));
        Assert.assertEquals(cos, expected);
    }

    @DataProvider(name = "CosDataProvider")
    public static Object[][] CosDataProvider() {
        return new Object[][]{
                {0, 1.0},
                {30, 0.8660254037844386},
                {45, 0.7071067811865475},
                {60, 0.5},
                {90, 0.0},
                {180, -1.0},
                {270, 0.0},
                {360, 1.0},
        };
    }
}
