package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {

    public static ArrayList<Animal> readFromFile(String filename) {

        ArrayList<Animal> animalArrayList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            br.readLine();

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Animal animal = new Animal(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
                animalArrayList.add(animal);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return animalArrayList;
    }
}
