package temperatures;

import com.sun.source.doctree.EscapeTree;
import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.List;

public class TemperatureController {

    private List<City> cities;
    private TemperatureStrategyConversion strategy;

    public TemperatureController() {
        cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public void addOrUpdateTemperature(String cityName, String country, double value, String unit, int month) {
        City city = findCity(cityName, country);
        Temperature temperature = new Temperature(value, unit, month);

        if(city == null) {
            city = new City(cityName, country);
            city.addOrUpateTemperature(temperature);
            cities.add(city);
        } else {
            city.addOrUpateTemperature(temperature);
        }
    }

    public void setTemperatureConversionStrategy(TemperatureStrategyConversion strategy) {
        this.strategy = strategy;
    }

    public void displayTemperatureInPreferdUnit() {
        if(strategy == null) {
            System.out.println("Please set the temperature conversion strategy");
        }

        for(City city : cities) {
            System.out.println("City: " + city.getName() + " , Country: " + city.getCountry());
            System.out.println("Month\tTemperature");

            for(int month = 1; month <= 12; month++) {
                Temperature temperature = city.getTemperature(month);
                if(temperature != null) {
                    double convertTemperature = strategy.convert(temperature.getValue());
                    System.out.println(month + "\t" + convertTemperature + " " + strategy.getUnit());
                }
            }

            System.out.println();
        }
    }

    public City findCity(String cityName, String country) {
        for(City city: cities) {
            if(city.getName().equals(cityName) && city.getCountry().equals(country)) {
                return city;
            }
        }
        return null;
    }

    //method to get cities
    public List<City> getCities() {
        return cities;
    }
}
