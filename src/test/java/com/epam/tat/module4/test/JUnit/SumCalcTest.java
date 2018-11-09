package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumCalcTest extends BaseCalcJunitTest{
    private long a, b;
    private long expected;

    public SumCalcTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 12, 22 },
                {10, -10, 0 },
                {0, 36, 36 },
                {-10, -20, -30 },
                {-9223372036854775808L , 9223372036854775807L, -1 }
        });
    }

    @Test
    public void testSum() {
        long result = calc.sum(a,b);
        Assert.assertEquals("Sum(" + a +" + "+ b + ") = is NOT equal " + result, expected, result, 0);
    }
}
