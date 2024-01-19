package org.example.Strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Traveler bobr = new Traveler();
        bobr.setTravellingStrategy(new TravelByCar());
        bobr.journey();

        bobr.setTravellingStrategy(new TravelByTrain());
        bobr.journey();
    }

}
