package org.example.Movie;

import io.vavr.Function2;

public class OrderLine {
    private final Function2<Movie, Integer, Double> computeMoviePrice;

    public OrderLine(Function2<Movie, Integer, Double> computeMoviePrice) {
        this.computeMoviePrice = computeMoviePrice;
    }

    public double computeMoviePrice(Movie movie, int quantity) {
        try {
            return computeMoviePrice.apply(movie, quantity);
        } catch (UnsupportedOperationException e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0;
        }
    }
}