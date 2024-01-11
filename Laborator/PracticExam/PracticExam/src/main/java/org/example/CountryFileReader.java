package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryFileReader {

    public List<Country> readCountriesFromFile(String filename) {
        List<Country> countries = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+");
                Country country = new Country(data[0], data[1], Long.parseLong(data[2]), Long.parseLong(data[3]), data[4]);

                countries.add(country);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
        return countries;
    }
}
