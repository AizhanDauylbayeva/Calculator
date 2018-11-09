package com.epam.tat.module4.test.JUnit.DoubleTest;

import com.epam.tat.module4.test.JUnit.BaseCalcJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivDoubleTest extends BaseCalcJunitTest {
    private double a, b;
    private double expected;

    public DivDoubleTest(double a, double b, double expected) {
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
        double result = calc.div(a, b);
        Assert.assertEquals("Div(" + a +" / " + b + ") = is NOT equal " + result, expected, result, 0);
    }
}
