package org.example;

public class AnimalThief implements AnimalCareTakerInterface {

    private AnimalCareTaker animalCareTaker;

    private AnimalThief(AnimalCareTaker animalCareTaker) {
        this.animalCareTaker = animalCareTaker;
    }

    @Override
    public void takeCareOfAnimal(Animal animal) {
        System.out.println("Animal thief stealing: " + animal.getName());
    }
}
