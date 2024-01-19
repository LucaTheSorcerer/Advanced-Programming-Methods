package org.example;

public class ThiefTest {

    public void test() {

        ActualCareTaker actualCareTaker = new ActualCareTaker();
        Animal animal = new Animal("muiu", "nuiu", 100, "cage", "healthy");


        assert (actualCareTaker.takeCareOfAnimal(animal).equals("Stealing animal" + animal.getName()));
    }
}
