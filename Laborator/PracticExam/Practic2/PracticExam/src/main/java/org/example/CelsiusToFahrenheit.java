package org.example;

public class CelsiusToFahrenheit implements TemperatureConversionStrategy{

    @Override
    public double convert(double temperature) {
        return temperature * 9/5 + 32;
    }
}
