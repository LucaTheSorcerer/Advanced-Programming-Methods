package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    public static ArrayList<Animal> readAnimalsFromFile(String filename) throws IOException {

        ArrayList<Animal> animalList= new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {

            br.readLine();
            String line;

            while((line=br.readLine()) != null) {
                String[] data = line.split(",");
                Animal animal = new Animal(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
                animalList.add(animal);
            }
        }

        return animalList;
    }
}
