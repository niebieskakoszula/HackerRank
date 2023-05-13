package ExceptionHandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @Test
    public void powerThrowsException() {
        var calulator = new MyCalculator();
        var exception = assertThrows(Exception.class, () -> calulator.power(-1, -2));
        assertEquals("n or p should not be negative.", exception.getMessage());
    }
}