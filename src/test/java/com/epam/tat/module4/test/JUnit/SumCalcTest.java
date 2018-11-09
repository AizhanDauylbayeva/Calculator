package com.epam.tat.module4.test.JUnit;

import org.junit.Assert;
import org.junit.Test;

public class SumCalcTest extends BaseCalcJunitTest{

    @Test
    public void testSum(){
        Assert.assertEquals(4, calc.sum(2, 2));
    }
}
