package com.epam.tat.module4.test.JUnit;
import com.epam.tat.module4.test.JUnit.DoubleTest.DivDoubleTest;
import com.epam.tat.module4.test.JUnit.DoubleTest.MultiDoubleTest;
import com.epam.tat.module4.test.JUnit.DoubleTest.SubDoubleTest;
import com.epam.tat.module4.test.JUnit.DoubleTest.SumDoubleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SumCalcTest.class,
        SumDoubleTest.class,
        SubCalcTest.class,
        SubDoubleTest.class,
        CosCalcTest.class,
        SinCalcTest.class,
        CtgCalcTest.class,
        TgCalcTest.class,
        DivCalcTest.class,
        DivDoubleTest.class,
        MultiCalcTest.class,
        MultiDoubleTest.class,
        NumberFormatExceptionTest.class,
        PositiveNegativeTest.class,
        PowCalcTest.class,
        SqrtCalcTest.class,
})
public class JunitTestSuite {
}
