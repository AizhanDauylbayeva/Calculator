package com.epam.tat.module4.test.JUnit;

import org.junit.Test;

public class NumberFormatExceptionTest extends BaseCalcJunitTest {

    @Test(expected = NumberFormatException.class)
    public void checkNumberException() {
        calc.div(3,0);
    }
}
