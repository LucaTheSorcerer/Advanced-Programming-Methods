package org.example;


import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

       ArrayList<Animal> animalArrayList = ReadFromFile.readFromFile("src/main/java/org/example/animals_inventory.csv");

        System.out.println(animalArrayList);

        AnimalStatistics.animalStatistics(animalArrayList);

        WriteToFile.writeToFile(animalArrayList, "src/main/java/org/example/sick_animals.txt");

        AnimalCareTakerTest animalCareTakerTest = new AnimalCareTakerTest();

        animalCareTakerTest.test();

        Animal animal = new Animal("Giugiu", "blabla", 10, "jacuzzi", "Healthy");


        AnimalThreads.animalMonitor(animal);

    }
}