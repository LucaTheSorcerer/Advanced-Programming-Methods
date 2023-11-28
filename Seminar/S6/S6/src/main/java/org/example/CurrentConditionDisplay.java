package org.example;

public class CurrentConditionDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity= humidity;
        this.pressure = pressure;
        display();
    }
}
