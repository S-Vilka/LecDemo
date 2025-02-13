import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalTest {

    @Test
    public void testSum() {
        Cal calculator = new Cal();
        assertEquals(15, calculator.sum(10, 5));
        assertEquals(0, calculator.sum(-5, 5));
    }

    @Test
    public void testSubtract() {
        Cal calculator = new Cal();
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-10, calculator.subtract(-5, 5));
    }

    @Test
    public void testMultiply() {
        Cal calculator = new Cal();
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(-25, calculator.multiply(-5, 5));
    }

    @Test
    public void testDivide() {
        Cal calculator = new Cal();
        assertEquals(2.0, calculator.divide(10, 5));
        assertEquals(-1.5, calculator.divide(-3, 2));

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}