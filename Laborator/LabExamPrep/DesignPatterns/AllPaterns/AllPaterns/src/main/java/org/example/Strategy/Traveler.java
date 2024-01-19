package org.example.Strategy;

public class Traveler {

    private TravellingStrategy travellingStrategy;

    public Traveler() {
    }

    public void setTravellingStrategy(TravellingStrategy travellingStrategy) {
        this.travellingStrategy = travellingStrategy;
    }

    public void journey() {
        this.travellingStrategy.travel();
    }
}
