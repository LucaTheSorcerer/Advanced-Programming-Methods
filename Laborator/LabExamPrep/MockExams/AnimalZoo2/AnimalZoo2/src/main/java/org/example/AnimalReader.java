package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalReader {

    public static List<Animal> readAnimalsFromFile(String filename) {
        List<Animal> animalsList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine();
            String line;

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Animal animal = new Animal(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
                animalsList.add(animal);
            }
        } catch (IOException e) {
            throw new RuntimeException("Idk");
        }
        return animalsList;
    }
}
