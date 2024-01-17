package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountryFileReader {

    public List<Country> filterFromFile(String filename) throws IOException {

        return Files.lines(Path.of(filename)).map(Country::parseCountry)
                .filter(c -> c.getName().startsWith("M") && c.getArea() > 10000)
                .collect(Collectors.toList());
    }

    public void writeToFileCSV(List<Country> countries, String filename) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        countries.stream().map(Country::toString).forEach(c -> {
            try {
                bw.write(c);
                bw.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bw.close();

    }
}
