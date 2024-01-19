package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AnimalFileWriter {

    public static void writeSickAnimalsToFile(List<Animal> animalList, String filename) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            animalList.stream()
                    .filter(animal -> "Sick".equals(animal.getHealthStatus()))
                    .map(animal -> animal.getName().toUpperCase())
                    .forEach(name -> {
                        try{
                            bw.write(name + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
