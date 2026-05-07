import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(6.5, calculator.add(3, 3.5), 0.0001);
    }

    @Test
    public void testDivideNormal() {
        assertEquals(2.0, calculator.divide(4.0, 2.0), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5.0, 0);
        });
        assertEquals("Không thể chia cho 0", exception.getMessage());
    }
}