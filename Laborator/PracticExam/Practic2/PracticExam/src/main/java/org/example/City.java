package org.example;

import java.util.List;

public class City {

    private String name;
    private String country;

    List<Temperatures> temperaturesList;


    public City(String name, String country, List<Temperatures> temperaturesList) {
        this.name = name;
        this.country = country;
        this.temperaturesList = temperaturesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Temperatures> getTemperaturesList() {
        return temperaturesList;
    }

    public void setTemperaturesList(List<Temperatures> temperaturesList) {
        this.temperaturesList = temperaturesList;
    }

    public void addTemperature(Temperatures temp) {
        this.temperaturesList.add(temp);
    }
}
