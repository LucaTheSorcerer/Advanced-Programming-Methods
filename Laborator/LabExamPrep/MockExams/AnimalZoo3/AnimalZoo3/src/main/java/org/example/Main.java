package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<Animal> animalArrayList = ReadFromFile.readAnimalsFromFile("src/main/java/org/example/animals_inventory.csv");

        System.out.println(animalArrayList);

        AnimalStatistics.countSpecies(animalArrayList);

        WriteToFile.writeToFile(animalArrayList, "src/main/java/org/example/sick_animals.txt");

        ThiefTest thiefTest = new ThiefTest();
        thiefTest.test();

        Animal animal = new Animal("muiu", "nuiu", 100, "cage", "healthy");

        AnimalThread animalThread = new AnimalThread();
        animalThread.monitorAnimals(animal);


    }
}