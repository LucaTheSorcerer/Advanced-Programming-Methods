package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalStatistics {

    public static void animalStatistics(ArrayList<Animal> animalArrayList) {
        Map<String, Long> animalCount = animalArrayList.stream()
                .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));

        animalCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
