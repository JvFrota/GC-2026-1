import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    Conversor conversor = new Conversor();

    @Test
    public void testFahrenheitParaCelsius() {
        // FORÇANDO ERRO PARA O CENÁRIO 2: 
        // 32°F deveria ser 0.0, mas vamos esperar 999.0 para falhar o build de propósito.
        assertEquals(999.0, conversor.fahrenheitParaCelsius(32.0), 0.001);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        // 100°C deve ser 212°F
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100.0), 0.001);
    }
}