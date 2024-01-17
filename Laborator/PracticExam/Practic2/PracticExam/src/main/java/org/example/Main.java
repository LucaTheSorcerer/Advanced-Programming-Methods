package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        CountryFileReader fileReader = new CountryFileReader();

        List<Country> filteredCountries = fileReader.filterFromFile("src/main/java/org/example/countries.txt");

        fileReader.writeToFileCSV(filteredCountries, "src/main/java/org/example/filtered_countries.csv");

        System.out.println(filteredCountries);
    }
}