package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CarGrouping {
    public static void main(String[] args) {
        // Given list of cars
        List<Car> cars = Arrays.asList(
                new Car("Dacia", "Papuc", 1995),
                new Car("Kia", "None", 1908),
                new Car("Ford", "Fiesta", 1997),
                new Car("VW", "Lupo", 1999)
        );

        // Group Dacias by Baujahr
        Map<Integer, List<String>> daciaGroupedByYear = cars.stream()
                .filter(car -> car.getBrand().equals("Dacia"))
                .collect(Collectors.groupingBy(Car::getYear,
                        Collectors.mapping(Car::getModel, Collectors.toList())));

        // Print the desired text
        System.out.println(String.join(", ", daciaGroupedByYear.get(1995)));
    }
}
