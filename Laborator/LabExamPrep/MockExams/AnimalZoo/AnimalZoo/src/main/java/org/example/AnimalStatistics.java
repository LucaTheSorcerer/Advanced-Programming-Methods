package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalStatistics {

    public void displaySpeciesCount(List<Animal> animalList) {
        Map<String, Long> speciesCount = animalList.stream()
                .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));

        speciesCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
