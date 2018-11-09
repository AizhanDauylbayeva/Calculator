package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TgCalcTest extends BaseCalcJunitTest{
    private double a;
    private double expected;

    public TgCalcTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {30, 0.5773502691896258},
                {45, 1},
                {60, 1.732050807568877},
                {180, 0},
                {360, 0}
        });
    }

    @Test
    public void testTg() {
        double result = calc.tg(Math.toRadians(a));
        Assert.assertEquals("Tg(" + a + ") = is NOT equal " + result, expected, result, 0);
    }
}
