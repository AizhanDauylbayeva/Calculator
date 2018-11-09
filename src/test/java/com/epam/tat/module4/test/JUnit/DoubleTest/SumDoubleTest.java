package com.epam.tat.module4.test.JUnit.DoubleTest;

import com.epam.tat.module4.test.JUnit.BaseCalcJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumDoubleTest extends BaseCalcJunitTest {
    private double a, b;
    private double expected;

    public SumDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10.2, 2, 12.2 },
                {10, -2.5, 7.5 },
                {-2.4, 1, -1.4 },
                {0.8, 0.4, 1.2 }
        });
    }

    @Test
    public void testSum() {
        double result = calc.sum(a, b);
        Assert.assertEquals("Sum(" + a +" + "+ b + ") = is NOT equal " + result, expected, result, 0);
    }
}
