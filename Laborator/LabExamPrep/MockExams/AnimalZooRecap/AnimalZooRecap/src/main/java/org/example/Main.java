package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<Animal> animalArrayList = ReadFromFile.animalArrayList("src/main/java/org/example/animals_inventory.csv");

        System.out.println(animalArrayList);

        AnimalFilter.filterAnimals(animalArrayList);

        WriteToFile.writeToFile(animalArrayList, "src/main/java/org/example/sick_animals.txt");

        ThiefTest thiefTest = new ThiefTest();

        thiefTest.test();

        Animal animal = new Animal("Bob", "Bob1", 14, "jacuzzi", "Healthy");


        AnimalThreads animalThreads = new AnimalThreads();

        animalThreads.animalMonitor(animal);


    }
}