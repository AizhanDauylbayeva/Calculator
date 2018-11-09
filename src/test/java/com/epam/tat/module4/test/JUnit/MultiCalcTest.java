package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultiCalcTest extends BaseCalcJunitTest{
    private long a, b;
    private long expected;

    public MultiCalcTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 5, 50 },
                {10, -2, -20 },
                {-4, -2, 8 },
                {0, 2, 0 }
        });
    }

    @Test
    public void testMulti() {
        long result = calc.mult(a, b);
        Assert.assertEquals("Multi(" + a / b + ") = is NOT equal " + result, expected, result, 0);
    }
}

