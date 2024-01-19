package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Animal> animalList = AnimalFileReader.readAnimalFromFile("src/main/java/org/example/animals_inventory.csv");

        System.out.println(animalList);

        AnimalStatistics animalStatistics = new AnimalStatistics();

        animalStatistics.displaySpeciesCount(animalList);

        AnimalFileWriter animalFileWriter = new AnimalFileWriter();

        animalFileWriter.writeSickAnimalsToFile(animalList, "src/main/java/org/example/sick_animals.txt");
    }
}