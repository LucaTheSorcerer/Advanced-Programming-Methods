package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {

        String filePAth = "src/main/java/org/example/shoppinglist.csv";

        try {
            Map<String, Double> itemTotalCosts = Files.lines(Paths.get(filePAth))
                    .skip(1)
                    .map(line -> line.split(","))
                    .collect(Collectors.groupingBy(
                            columns -> columns[0],
                            Collectors.summingDouble(columns -> Double.parseDouble(columns[1]) * Double.parseDouble(columns[2]))
                    ));

            itemTotalCosts.forEach((item, totalCost) -> System.out.println(item + ": " + totalCost));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
