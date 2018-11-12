import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before (){
        calculator = new Calculator();
    }

    @Test
    public void Add(){
        assertEquals(5, calculator.Add(2,3));
    }

    @Test
    public void Subtract(){
        assertEquals(2, calculator.Subtract(9,7));
    }

    @Test
    public void Multiply(){
        assertEquals(63, calculator.Multiply(9,7));
    }

    @Test
    public void Divide(){
        assertEquals(10.00, calculator.Divide(20,2), 0.01);
    }

}
