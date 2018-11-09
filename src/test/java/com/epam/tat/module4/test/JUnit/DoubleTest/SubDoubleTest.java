package com.epam.tat.module4.test.JUnit.DoubleTest;

import com.epam.tat.module4.test.JUnit.BaseCalcJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubDoubleTest extends BaseCalcJunitTest {
    private double a, b;
    private double expected;

    public SubDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10.2, 2, 8.2 },
                {10, -2.5, 12.5 },
                {-2.4, 1, -3.4 },
                {0.8, 0.4, 0.4 }
        });
    }

    @Test
    public void testSub() {
        double result = calc.sub(a, b);
        Assert.assertEquals("Sum(" + a +" - "+ b + ") = is NOT equal " + result, expected, result, 0);
    }
}
