package org.example;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void ShowFuelLevel() {
        System.out.println("Fuel Level: " + car.getFuel());
    }

    public void showStatus() {
        if(this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car is not started");
        }
    }
}
