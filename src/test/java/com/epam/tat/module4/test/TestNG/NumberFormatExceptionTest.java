package com.epam.tat.module4.test.TestNG;

import org.testng.annotations.Test;

public class NumberFormatExceptionTest extends BaseCalcTest {

    @Test(expectedExceptions = NumberFormatException.class)
    public void checkNumberException() {
        calc.div(3,0);
    }
}
