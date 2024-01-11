package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryReader reader = new CountryReader();
        List<Country> countries = reader.readCountriesFromFile("src/main/java/org/example/countries.txt");
        System.out.println(countries);

        CountryFilter filter = new CountryFilter();
        List<Country> filteredCountries = filter.filterCountries(countries);

        System.out.println(filteredCountries);

        CountryCSVWriter writer = new CountryCSVWriter();
        writer.writeCountriesToCSV(filteredCountries, "src/main/java/org/example/filtered_countries.csv");
    }
}