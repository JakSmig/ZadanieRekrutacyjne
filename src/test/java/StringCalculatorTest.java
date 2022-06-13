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

        //Step 2
        assertEquals(15, calc.Add("1,2,3,4,5"));

        //Step 3
        assertEquals(6, calc.Add("1\n2,3"));
    }
}