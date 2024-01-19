package org.example;

public class AnimalCareTakerTest {

    public void test() {

        AnimalCareTaker animalCareTaker = new AnimalCareTaker();
        Animal animal = new Animal("Giugiu", "blabla", 10, "jacuzzi", "Healthy");

        assert ((animalCareTaker.takeCareOfAnimal(animal).equals("Thief is stealing animal: Giugiu")));
    }
}
