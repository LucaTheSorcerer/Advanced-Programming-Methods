package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {

    public static ArrayList<Animal> animalArrayList(String filename) throws IOException {

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {

            br.readLine();
            String line;
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Animal animal = new Animal(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
                animalArrayList.add(animal);
            }
        }
        return animalArrayList;
    }
}
