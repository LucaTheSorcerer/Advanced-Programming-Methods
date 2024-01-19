package org.example.Builder;

public interface Builder {

    Builder setEngine(String engine);
    Builder setModel(String model);
    Builder setTransmission(String transmission);
    Builder setBrakes(String brakes);

    Car getResult();
}
