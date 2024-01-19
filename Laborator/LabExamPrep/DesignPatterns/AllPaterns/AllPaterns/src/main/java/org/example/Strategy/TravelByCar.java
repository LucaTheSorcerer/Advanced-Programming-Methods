package org.example.Strategy;

public class TravelByCar implements TravellingStrategy {

    public TravelByCar() {
    }

    @Override
    public void travel() {
        System.out.println("Travelling by car");
    }
}
