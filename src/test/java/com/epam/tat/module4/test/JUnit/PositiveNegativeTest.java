package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;

public class PositiveNegativeTest extends BaseCalcJunitTest {

    @Test
    public void testPositive(){
        Assert.assertFalse(calc.isPositive(0));
        Assert.assertTrue(calc.isPositive(1));
    }

    @Test
    public void testNegative(){
        Assert.assertFalse(calc.isNegative(1));
        Assert.assertTrue(calc.isNegative(-1));
    }
}
