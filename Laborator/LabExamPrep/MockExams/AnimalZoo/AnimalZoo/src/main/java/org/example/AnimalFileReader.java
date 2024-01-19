package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalFileReader {

    public static List<Animal> readAnimalFromFile(String filename) throws IOException {

        List<Animal> animalList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine();

            String line;
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                animalList.add(new Animal(values[0], values[1], Integer.parseInt(values[2]),values[3], values[4]));
            }
        } catch (IOException e) {
            throw new IOException();
        }
//        System.out.println(animalList);
        return animalList;
    }
}
