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

        //Step 4
        assertEquals(3, calc.Add("//;\n1;2"));
        assertEquals(10, calc.Add("//multiCharacter\n1\n3multiCharacter2\n4"));

        //Step 5
        Exception exception = assertThrows(RuntimeException.class, () -> calc.Add("//;\n1;-2"));
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("negatives not allowed -2"));

    }
}