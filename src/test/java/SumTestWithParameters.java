import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

@RunWith(Parameterized.class)
public class SumTestWithParameters
{
    private static Calculator calculator;
    double number1;
    double number2;
    double result;

    public SumTestWithParameters(double number1, double number2, double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> sumParameters()
    {
        return Arrays.asList(new Object[][]{
                {
                        2, 4, 6
                },
                {
                        2, -2, 0
                },
                {
                        -2, -2, -4
                },
                {
                        1000, 2000, 3000
                },
                {
                        5.6, 4.5, 10.1
                }
        });
    }

    @BeforeClass
    public static void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    public void sumScenarios()
    {
        Assert.assertEquals(calculator.sum(number1, number2),result, Math.pow(10, Math.log10(Math.abs(calculator.sum(number1, number2)) - 12)));
    }

}
