package notation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
    String strToCalc = "1 5 3 2  * - +";

    @Test
    public void shouldCalculateAddition() {
        assertEquals(0, calculator.calculatePolishNotation(strToCalc));
    }
}