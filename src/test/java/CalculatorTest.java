import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(2, 8));
    }

    @Test
    public void canSubtract(){
        assertEquals(20, calculator.subtract(25, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(7.5, calculator.divide(15, 2), 0.1);
    }

}
