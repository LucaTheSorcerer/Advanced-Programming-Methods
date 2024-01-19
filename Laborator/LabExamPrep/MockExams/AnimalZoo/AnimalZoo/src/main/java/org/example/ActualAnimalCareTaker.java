package org.example;

public class ActualAnimalCareTaker implements AnimalCareTaker{

    @Override
    public void takeCareOfAnimal(Animal animal) {
        System.out.println("Animal Caretaker: Taking care of " + animal.getName());
    }
}
