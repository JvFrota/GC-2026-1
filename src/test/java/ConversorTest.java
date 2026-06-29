import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    @Test
    public void testeFahrenheitParaCelsius() {
        // 32F deve ser igual a 0C (Este vai passar)
        assertEquals(0.0, Conversor.fahrenheitParaCelsius(32.0), 0.001);
    }

    @Test
    public void testeCelsiusParaFahrenheit() {
        // Modificado de 32.0 para 999.0 para forçar a falha no teste (Cenário 3)
        assertEquals(999.0, Conversor.celsiusParaFahrenheit(0.0), 0.001);
    }
}