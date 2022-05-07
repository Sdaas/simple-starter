import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void addTest1(){
        int result = calc.add(10,20);
        assertEquals(30, result);
    }

    @Test
    void multiplyTest1(){
        int result = calc.multiply(10,20);
        assertEquals(200,result);
    }
}
