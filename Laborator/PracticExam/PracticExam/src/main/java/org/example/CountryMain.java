package org.example;

import java.io.IOException;
import java.util.List;

public class CountryMain {

    public static void main(String[] args) throws IOException {
        CountryFileReader reader = new CountryFileReader();
        List<Country> countries = reader.readCountriesFromFile("src/main/java/org/example/countries.txt");

        CountryFilter filter = new CountryFilter();
        List<Country> filteredCountries = filter.filterCountries(countries);

        CSVFileWriter writer = new CSVFileWriter();
        writer.writeCountriesToCSV(filteredCountries, "src/main/java/org/example/filtered_countries.csv");
    }
}
