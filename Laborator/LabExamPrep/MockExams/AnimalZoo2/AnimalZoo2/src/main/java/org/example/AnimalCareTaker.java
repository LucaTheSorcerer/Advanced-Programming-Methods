package org.example;

public class AnimalCareTaker implements  AnimalCareTakerInterface {

    @Override
    public void takeCareOfAnimal(Animal animal) {
        System.out.println("Animal caretaker taking care of animal: " + animal.getName());
    }
}
