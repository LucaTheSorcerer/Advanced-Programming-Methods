package org.example;

import java.util.List;

public class ViewTemperature {

    TemperatureController controller;
    TemperatureConversionStrategy strategy;

    public ViewTemperature(TemperatureController controller, TemperatureConversionStrategy strategy) {
        this.controller = controller;
        this.strategy = strategy;
    }


    public void displayTemperatures() {

        List<City> cities = controller.getCitiesAndTemperatures();

        for(City city : cities) {
            System.out.println("City: " + city.getName());

            for(Temperatures temperatures1 : city.getTemperaturesList()) {
                System.out.println(strategy.convert(temperatures1.getValue()));
            }
        }
    }







}
