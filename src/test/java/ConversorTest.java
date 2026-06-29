import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    @Test
    public void testeFahrenheitParaCelsius() {
        // 32F deve ser igual a 0C
        assertEquals(0.0, Conversor.fahrenheitParaCelsius(32.0), 0.001);
    }

    @Test
    public void testeCelsiusParaFahrenheit() {
        // 0C deve ser igual a 32F
        assertEquals(32.0, Conversor.celsiusParaFahrenheit(0.0), 0.001);
    }
}