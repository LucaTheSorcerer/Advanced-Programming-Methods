package org.example.Order;

import io.vavr.control.Option;

public class ComedyMovie extends Movie {
    public ComedyMovie(String title, int releaseYear, double evaluation, Option<String> actor, double basePrice) {
        super(title, releaseYear, evaluation, actor, basePrice);
    }
}

