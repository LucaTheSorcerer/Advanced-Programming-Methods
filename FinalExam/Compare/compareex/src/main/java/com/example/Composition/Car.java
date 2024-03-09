package com.example.Composition;

public class Car {

    private Engine engine;

    public Car(String engineType) {
        this.engine = new Engine(engineType);
    }

    public String getEngineType() {
        return engine.getType();
    }
}

