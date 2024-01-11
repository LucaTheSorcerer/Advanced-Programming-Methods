package temperatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TemperatureControllerTest {

    private TemperatureController controller;

    @BeforeEach
    public void setUp() {
        controller = new TemperatureController();
    }

    @Test
    public void addCity() {
        City city = new City("Berlin", "Germany");
        controller.addCity(city);

        assertEquals(1, controller.getCities().size());
    }

    @Test
    public void testAddOrUpdateTemperature() {
        controller.addOrUpdateTemperature("Berlin", "Germany", 20.0, "Celsius", 1);
        City city = controller.getCities().get(0);
        Temperature temperature = city.getTemperature(1);
        assertEquals(20.0, temperature.getValue(), 0.01);
    }

    @Test
    public void testTemperatureConversion() {
        controller.addOrUpdateTemperature("Berlin", "Germany", 20.0, "Celsius", 1);
        controller.setTemperatureConversionStrategy(new CelsiusToFahrenheitStrategy());
        String expectedUnit = "Fahrenheit";

        for (City city : controller.getCities()) {
            for (int month = 1; month <= 12; month++) {
                Temperature temperature = city.getTemperature(month);
                if (temperature != null) {
                    assertEquals(expectedUnit, temperature.getUnit());
                }
            }
        }
    }
}
