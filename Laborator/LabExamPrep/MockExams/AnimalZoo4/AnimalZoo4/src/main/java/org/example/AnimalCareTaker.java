package org.example;

public class AnimalCareTaker implements CareTakerInterface {

    Thief thief;

    @Override
    public String takeCareOfAnimal(Animal animal) {
        return thief.takeCareOfAnimal(animal);
    }
}
