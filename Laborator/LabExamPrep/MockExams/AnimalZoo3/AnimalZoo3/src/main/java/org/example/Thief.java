package org.example;

public class Thief implements Caretaker {

    @Override
    public String takeCareOfAnimal(Animal animal) {
        return "Stealing animal" + animal.getName();
    }
}
