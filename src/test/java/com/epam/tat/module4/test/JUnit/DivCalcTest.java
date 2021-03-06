package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivCalcTest extends BaseCalcJunitTest{
    private long a, b;
    private long expected;

    public DivCalcTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 5, 2 },
                {10, 10, 1 },
                {-4, -2, 2 },
                {0, 2, 0 }
        });
    }

    @Test
    public void testCtg() {
        long result = calc.div(a, b);
        Assert.assertEquals("Div(" + a / b + ") = is NOT equal " + result, expected, result, 0);
    }
}
