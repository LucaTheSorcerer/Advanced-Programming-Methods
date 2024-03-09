package com.example.AbstractPolymorphism;

public class Dog extends Animal {

    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void swim() {
        System.out.println("Dog is swimming");
    }
}
