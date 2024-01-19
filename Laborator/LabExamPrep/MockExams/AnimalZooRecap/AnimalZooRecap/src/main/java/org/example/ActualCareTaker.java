package org.example;

public class ActualCareTaker implements CareTaker {

    Thief thief;
    @Override
    public String takeCareOfAnimal(Animal animal) {
        return thief.takeCareOfAnimal(animal);
    }
}
