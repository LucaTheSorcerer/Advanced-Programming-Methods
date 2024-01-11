package org.example;

public class Country {

    private String name;
    private String continent;
    private long area;
    private long population;
    private String capital;

    public Country(String name, String continent, long area, long population, String capital) {
        this.name = name;
        this.continent = continent;
        this.area = area;
        this.population = population;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public long getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return name + ";" + continent + ";" + area + ";" + population + ";" + capital;
    }
}
