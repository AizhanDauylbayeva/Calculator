package com.epam.tat.module4.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest extends BaseCalcTest{

    @Test(dataProvider = "SubDataProvider")
    public void testSub(long a, long b, long expected) {
        long sub = calc.sub(a, b);
        Assert.assertEquals(sub, expected);
    }

    @DataProvider(name = "SubDataProvider")
    public static Object[][] SumDataProvider(){
        return new Object[][] {
                {10, 12, -2 },
                {10, 10, 0 },
                {0, 36, -36 },
                {-10, -20, 10 },
                {-9223372036854775807L , -9223372036854775808L, 1 }
        };
    }
}
