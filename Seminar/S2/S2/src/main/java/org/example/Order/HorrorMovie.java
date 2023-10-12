package org.example.Order;

import io.vavr.control.Option;

public class HorrorMovie extends Movie {
    public HorrorMovie(String title, int releaseYear, double evaluation, Option<String> actor, double basePrice) {
        super(title, releaseYear, evaluation, actor, basePrice);
    }
}
