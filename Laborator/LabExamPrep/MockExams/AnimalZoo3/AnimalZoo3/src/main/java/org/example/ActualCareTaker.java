package org.example;

public class ActualCareTaker implements Caretaker {

    Thief thief = new Thief();

    @Override
    public String takeCareOfAnimal(Animal animal) {
        return thief.takeCareOfAnimal(animal);
    }
}
