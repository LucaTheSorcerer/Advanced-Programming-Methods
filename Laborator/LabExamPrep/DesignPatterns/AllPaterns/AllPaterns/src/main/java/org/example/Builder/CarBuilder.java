package org.example.Builder;

public class CarBuilder implements Builder {

    private String model;
    private String engine;
    private String transmission;
    private String brakes;


    @Override
    public Builder setEngine(String engine) {
        this.engine = engine;
        return this;

    }

    @Override
    public Builder setModel(String model) {
        this.model = model;
        return this;

    }

    @Override
    public Builder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setBrakes(String brakes) {
        this.brakes = brakes;
        return this;
    }


    @Override
    public Car getResult() {
        return new Car(model, engine, transmission, brakes);
    }
}
