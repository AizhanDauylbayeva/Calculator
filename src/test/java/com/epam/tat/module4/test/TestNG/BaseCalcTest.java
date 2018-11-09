package com.epam.tat.module4.test.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseCalcTest {

    protected Calculator calc;

    @BeforeClass()
    public void setUp() {
        calc = new Calculator();
    }
}
