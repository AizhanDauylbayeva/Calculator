package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PowCalcTest extends BaseCalcJunitTest{
    private double a, b;
    private double expected;

    public PowCalcTest(double a, double b, double expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {2, 3, 8 },
                {0, 2, 0 },
                {-3, 3, -27 },
                {0.1, 2, 0.01 },
                {5, 0.2, 1.3797296615 }
        });
    }

    @Test
    public void testPow(){
        double result = calc.pow(a,b);
        Assert.assertEquals("Pow(" + a + "^" + b +") = is NOT equal " + result, expected, result, 0);
    }
}
