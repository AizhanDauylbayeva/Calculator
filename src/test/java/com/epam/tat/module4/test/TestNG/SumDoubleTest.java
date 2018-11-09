package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalcTest{
    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "SumDataProvider")
    public SumDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testSum(){
        double sum = calc.sum(a, b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "SumDataProvider")
    public static Object[][] SumDataProvider(){
        return new Object[][] {
                {10.2, 2, 12.2 },
                {10, -2.5, 7.5 },
                {-2.4, 1, -1.4 },
                {0.8, 0.4, 1.2 }
        };
    }
}
