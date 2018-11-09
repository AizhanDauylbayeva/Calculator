package com.epam.tat.module4.test.JUnit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Math.round;


@RunWith(Parameterized.class)
public class CosCalcTest extends BaseCalcJunitTest {
    private double a;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1.0},
                {30, 0.8660254037844386},
                {45, 0.7071067811865475},
                {60, 0.5},
                {90, 0.0},
                {180, -1.0},
                {270, 0.0},
                {360, 1.0},
        });
    }

    public CosCalcTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testCos() {
        double result = round(calc.cos(Math.toRadians(a)));
        Assert.assertEquals("Cos(" + a + ") = is NOT equal " + result, expected, result, 0);
    }
}
