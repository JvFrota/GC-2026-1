import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    Conversor conversor = new Conversor();

    @Test
    public void testFahrenheitParaCelsius() {
        // CORRIGIDO PARA O CENÁRIO 3: 32°F deve ser 0°C
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), 0.001);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        // 100°C deve ser 212°F
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100.0), 0.001);
    }
}