package org.example;

public class FahrenheitToCelsius implements TemperatureConversionStrategy{

    @Override
    public double convert(double temperature) {
        return (temperature - 32) * 5/9;
    }
}
