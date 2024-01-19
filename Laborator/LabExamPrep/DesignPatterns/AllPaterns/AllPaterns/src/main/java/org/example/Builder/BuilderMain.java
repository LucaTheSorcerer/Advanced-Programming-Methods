package org.example.Builder;

public class BuilderMain {


    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car car = builder.setModel("dacia").setEngine("1l").setTransmission("vai de capu ei").setBrakes("naspa").getResult();
        System.out.println(car);

    }
}
