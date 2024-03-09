package com.example.InterfacePolymorphism;

public interface Animal {

    default void sound() {
        System.out.println("Animal makes a noise");
    }
}
