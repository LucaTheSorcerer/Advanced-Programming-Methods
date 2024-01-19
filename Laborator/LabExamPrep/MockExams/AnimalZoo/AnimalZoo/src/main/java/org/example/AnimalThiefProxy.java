package org.example;

public class AnimalThiefProxy implements AnimalCareTaker{
    private AnimalCareTaker animalCareTaker;

    private AnimalThiefProxy(AnimalCareTaker animalCareTaker) {
        this.animalCareTaker = animalCareTaker;
    }

    @Override
    public void takeCareOfAnimal(Animal animal) {
        System.out.println("Animal Thief: Stealing " + animal.getName());
    }

}
