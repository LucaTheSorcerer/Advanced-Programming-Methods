package temperatures;

public class FahrenheitToCelsiusStrategy implements TemperatureStrategyConversion{

    @Override
    public double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    @Override
    public String getUnit() {
        return "Celsius";
    }
}
