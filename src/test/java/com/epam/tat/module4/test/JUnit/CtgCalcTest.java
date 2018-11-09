package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CtgCalcTest extends BaseCalcJunitTest {
    private double a;
    private double expected;

    public CtgCalcTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {30, 1.732050807568877},
                {45, 1},
                {60, 0.5773502691896258},
                {90, 0},
                {270, 0},
        });
    }

    @Test
    public void testCtg() {
        double result = calc.ctg(Math.toRadians(a));
        Assert.assertEquals("Ctg(" + a + ") = is NOT equal " + result, expected, result, 0);
    }
}
