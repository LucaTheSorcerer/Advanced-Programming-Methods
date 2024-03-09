package com.example.AbstractPolymorphism;

public class Labrador extends Dog{

    private String breed;
    public Labrador(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public Labrador(String name, int age) {
        super(name, age);
    }

    public void swim() {
        super.swim();
    }
}
