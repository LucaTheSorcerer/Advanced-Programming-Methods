package temperatures;

import java.util.HashMap;
import java.util.Map;

public class City {

    private String name;
    private String country;
    private Map<Integer, Temperature> temperatures;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
        this.temperatures = new HashMap<>();
    }

    public void addOrUpateTemperature(Temperature temperature) {

        temperatures.put(temperature.getMonth(), temperature);
    }

    public Map<Integer, Temperature> getTemperatures() {
        return temperatures;
    }

    public Temperature getTemperature(int month) {
        return temperatures.get(month);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
