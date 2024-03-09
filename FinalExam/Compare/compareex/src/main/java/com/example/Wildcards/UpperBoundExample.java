package com.example.Wildcards;

public class UpperBoundExample {

    public static void printSound(Box<? extends Animal> animalBox) {
        Animal animal = animalBox.getValue();
        animal.sound();
    }

    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(new Dog());
        printSound(dogBox);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(new Cat());
        printSound(catBox);

    }

}



