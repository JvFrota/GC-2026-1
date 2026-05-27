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
        
        // PONTO E VÍRGULA CORRIGIDO PARA O BUILD VOLTAR A FICAR VERDE
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0));
    }
}