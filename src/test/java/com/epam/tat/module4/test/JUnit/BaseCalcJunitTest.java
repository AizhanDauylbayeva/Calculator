package com.epam.tat.module4.test.JUnit;
import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;

public class BaseCalcJunitTest {
    protected static Calculator calc;

    @BeforeClass
    protected static void setUp() {
        System.out.println("Prepare instance of Calculator");
        calc = new Calculator();
    }
}
