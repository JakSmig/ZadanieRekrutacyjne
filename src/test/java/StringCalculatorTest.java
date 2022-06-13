import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calc = new StringCalculator();

    @Test
    void add() {

        //Step 1
        assertEquals(0, calc.Add(""));
        assertEquals(1, calc.Add("1"));
        assertEquals(3, calc.Add("1,2"));
    }
}