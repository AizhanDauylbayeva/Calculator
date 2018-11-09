package com.epam.tat.module4.test.JUnit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SumCalcTest.class,
        SubCalcTest.class,
        CosCalcTest.class,
        SinCalcTest.class,
        CtgCalcTest.class,
        TgCalcTest.class,
        DivCalcTest.class,
        MultCalcTest.class,
        NumberFormatExceptionTest.class,
        PositiveNegativeTest.class,
        PowCalcTest.class,
        SqrtCalcTest.class,
})
public class JunitTestSuite {
}
