import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    @Test
    public void testCelsiusParaFahrenheit() {
        Conversor conversor = new Conversor();
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0));
    }

    @Test
    public void testFahrenheitParaCelsius() {
        Conversor conversor = new Conversor();
        
        // FALTANDO O PONTO E VÍRGULA ABAIXO DE PROPÓSITO PARA O CENÁRIO 4.2
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0))
    }
}