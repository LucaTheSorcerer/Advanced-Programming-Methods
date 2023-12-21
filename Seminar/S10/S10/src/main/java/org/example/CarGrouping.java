package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CarGrouping {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Kia", "None", 1908),
                new Car("Dacia", "Papuc", 1995),
                new Car("VW", "Lupo", 1999),
                new Car("Ford", "Fiesta", 1997)
        );

        Map<Integer, List<String>> carModelsByYear = cars.stream()
                .filter(car -> !car.getModel().equals("None"))
                .collect(Collectors.groupingBy(
                        Car::getYear,
                        Collectors.mapping(Car::getModel, Collectors.toList())
                ));

        System.out.println(carModelsByYear);
    }
}
