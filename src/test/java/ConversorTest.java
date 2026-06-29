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
        // Corrigido de volta para 32.0 para o teste passar com sucesso
        assertEquals(32.0, Conversor.celsiusParaFahrenheit(0.0), 0.001);
    }
}