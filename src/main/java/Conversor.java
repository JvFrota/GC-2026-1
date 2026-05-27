public class Conversor {

    // Método 1: Fahrenheit para Celsius
    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Método 2: Celsius para Fahrenheit
    public double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}