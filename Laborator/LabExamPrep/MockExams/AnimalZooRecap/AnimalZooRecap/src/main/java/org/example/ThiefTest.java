package org.example;

public class ThiefTest {

    public void test() {

        ActualCareTaker actualCareTaker = new ActualCareTaker();
        Animal animal = new Animal("Bob", "Bob1", 14, "jacuzzi", "Healthy");
        assert(actualCareTaker.takeCareOfAnimal(animal).equals("Thief is stealing animal: " + animal.getName()));

    }
}
