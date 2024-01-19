package org.example;

public class Thief implements CareTakerInterface {

    @Override
    public String takeCareOfAnimal(Animal animal) {
        return "Thief is stealing animal: " + animal.getName();
    }
}
