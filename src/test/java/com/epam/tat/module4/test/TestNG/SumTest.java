package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumTest extends BaseCalcTest {
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "SumDataProvider")
    public SumTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testSum(){
        long sum = calc.sum(a, b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "SumDataProvider")
    public static Object[][] SumDataProvider(){
        return new Object[][] {
                {10, 12, 22 },
                {10, -10, 0 },
                {0, 36, 36 },
                {-10, -20, -30 },
                {-9223372036854775808L , 9223372036854775807L, -1 }
        };
    }


}
