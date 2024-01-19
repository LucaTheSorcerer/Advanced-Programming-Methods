package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFile {

    public static void writeToFile(ArrayList<Animal> animalArrayList, String filename) throws IOException {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            animalArrayList.stream()
                    .filter(animal -> animal.getHealthStatus().equals("Sick"))
                    .map(animal -> animal.getName().toUpperCase())
                    .forEach(animal -> {
                        try {
                            bw.write(animal + '\n');
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }
}
