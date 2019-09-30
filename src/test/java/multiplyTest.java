import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;


//import org.junit.Rule;
//import org.junit.rules.ExpectedException;

public class multiplyTest {


    @Test
    public void whenN1andN2AreIntegersAndAreMultiply() {
        //Arrange
        Calculator calculator = null;
        //Act
        calculator = new Calculator();
        double actual = calculator.multiply(4,5);
        double delta = Math.pow(10, Math.log10(Math.abs(actual)) - 12);
        //Assert
        Assert.assertEquals(9, actual, delta);
    }

    /*
    @Test
    public void whenN1isNegativeAndN2isPositiveReturnSum() {
        //Arrange
        Calculator calculator = null;
        //Act
        calculator = new Calculator();
        double actual = calculator.sum(-4,5);
        double delta = Math.pow(10, Math.log10(Math.abs(actual)) - 12);
        //Assert
        Assert.assertEquals(1, actual, delta);
    }

    @Test
    public void whenN1andN2AreFloatAndAreAdded() {
        //Arrange
        Calculator calculator = null;
        //Act
        calculator = new Calculator();
        double actual = calculator.sum(4.5,5.6);
        double delta = Math.pow(10, Math.log10(Math.abs(actual)) - 12);
        //Assert
        Assert.assertEquals(10.1, actual, delta);
    }*/
}
