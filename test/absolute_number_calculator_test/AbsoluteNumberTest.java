package absolute_number_calculator_test;

import absolute_number_calculator.AbsoluteNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberTest {
    @Test
    void testFindAbsolute0() {
        double number = 0;
        double expected = 0;

        double result =  AbsoluteNumber.absoluteNumberCalculator(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        double number = 1;
        double expected = 1;

        double result = AbsoluteNumber.absoluteNumberCalculator(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        double number = -1;
        double expected = 1;

        double result = AbsoluteNumber.absoluteNumberCalculator(number);
        assertEquals(expected, result);
    }
}
