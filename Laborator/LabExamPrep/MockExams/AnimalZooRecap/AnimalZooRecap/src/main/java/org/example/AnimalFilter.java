package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalFilter {

    public static void filterAnimals(ArrayList<Animal> animalArrayList) {

        Map<String, Long> animalFilter = animalArrayList.stream()
                .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));

        animalFilter.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entity -> System.out.println(entity.getKey() + ": " + entity.getValue()));
    }
}
