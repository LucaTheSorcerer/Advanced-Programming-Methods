package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class CountryFilter {

    public List<Country> filterCountries(List<Country> countries) {
        return countries.stream()
                .filter(c -> c.getName().startsWith("M") && c.getArea() > 10000)
                .collect(Collectors.toList());
    }
}
