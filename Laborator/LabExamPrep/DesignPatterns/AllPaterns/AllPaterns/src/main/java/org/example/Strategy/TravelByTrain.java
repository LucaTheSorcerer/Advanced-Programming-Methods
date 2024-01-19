package org.example.Strategy;

public class TravelByTrain implements TravellingStrategy {

    @Override
    public void travel() {
        System.out.println("Travelling by train");
    }
}
