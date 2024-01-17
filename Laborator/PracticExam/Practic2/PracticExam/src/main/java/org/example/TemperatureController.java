package org.example;

import java.util.List;

public class TemperatureController {

    private List<City> cities;
    private TemperatureConversionStrategy strategy;

    public TemperatureController(List<City> cities) {
        this.cities = cities;
    }

    public void addTemperature(City city, Temperatures temperatures) {

        for(City c : cities) {
            if(c.getName().equals(city.getName())) {
                for(Temperatures temperatures1 : c.getTemperaturesList()) {
                    if(temperatures1.getMonth() == temperatures.getMonth()) {
                        temperatures1.setValue(temperatures.getValue());
                        return;
                    }
                }
                c.addTemperature(temperatures);
                return;
            }
        }
        city.addTemperature(temperatures);
        cities.add(city);

    }

    public void setTemperatureConversionStrategy(TemperatureConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public List<City> getCitiesAndTemperatures() {
        return cities;
    }
}
