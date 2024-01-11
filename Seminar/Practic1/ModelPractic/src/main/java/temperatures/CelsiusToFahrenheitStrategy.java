package temperatures;

public class CelsiusToFahrenheitStrategy implements TemperatureStrategyConversion{

    @Override
    public double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public String getUnit() {
        return "Fahrenheit";
    }
}
