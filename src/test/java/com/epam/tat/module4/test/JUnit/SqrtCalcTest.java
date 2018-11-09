package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SqrtCalcTest extends BaseCalcJunitTest{
    private double a;
    private double expected;

    public SqrtCalcTest(double a, double expected){
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {4, 2 },
                {10, 3.1622776601683795 },
                {-16, 4 },
                {0.25, 0.5}
        });
    }

    @Test
    public void testSqrt(){
        double result = calc.sqrt(a);
        Assert.assertEquals("Pow(" + a + ") = is NOT equal " + result, expected, result, 0);
    }
}
