package org.example.Builder;

public class Car {

    private String model;
    private String engine;
    private String transmission;
    private String brakes;

    public Car(String model, String engine, String transmission, String brakes) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.brakes = brakes;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", brakes='" + brakes + '\'' +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public void buildCar() {
        if(model == null || engine == null || transmission == null || brakes == null) {
            throw new RuntimeException("Nu mere masina boss");
        }
    }
}
