package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = AnimalReader.readAnimalsFromFile("src/main/java/org/example/animals_inventory.csv");
        System.out.println(animalList);

        for(Animal animal: animalList) {
            DoctorThread doctorThread = new DoctorThread(animal);
            DiseaseThread diseaseThread = new DiseaseThread(animal);

            doctorThread.start();
            diseaseThread.start();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            doctorThread.interrupt();
            diseaseThread.interrupt();

        }




    }
}