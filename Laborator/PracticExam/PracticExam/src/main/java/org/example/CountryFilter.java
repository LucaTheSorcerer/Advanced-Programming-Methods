package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class CountryFilter {

    public List<Country> filterCountries(List<Country> countries) {
        return countries.stream()
                .filter(country -> country.getName().startsWith("M") && country.getArea() > 10000)
                .collect(Collectors.toList());
    }
}
