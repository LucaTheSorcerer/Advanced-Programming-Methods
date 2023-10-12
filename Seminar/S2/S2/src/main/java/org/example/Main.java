package org.example;

import org.example.Entity.Entity;
import org.example.Movie.FastSorter;
import org.example.Movie.Sorter;
import io.vavr.collection.List;
import io.vavr.control.Option;
import org.example.Order.*;



public class Main {
    public static void main(String[] args) {

        List<Entity> entities = List.of(
                new Entity("Saw", 1.0, true),
                new Entity("Hammer", 2.0, false),
                new Entity("Saw", 3.0, true)
        );

        System.out.println(entities.filter(entity -> entity.getWeight() > 1.0));

        Option<String> noActor = Option.none();
        Option<String> adamSandler = Option.of("Adam Sandler");

        Movie comedyMovieWithoutSandler = new Movie("Happy Gilmore", 1996, 7.0, noActor, 12.0);
        Movie comedyMovieWithSandler = new Movie("Some Movie", 2000, 8.0, adamSandler, 10.0);

        Discounter comedyDiscounter = new ComedyMovieDiscounter(adamSandler);

        try {
            double priceWithoutSandler = comedyDiscounter.calculatePrice(comedyMovieWithoutSandler.getBasePrice());
            System.out.println("Price for movie without Adam Sandler: $" + priceWithoutSandler);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        double priceWithSandler = comedyDiscounter.calculatePrice(comedyMovieWithSandler.getBasePrice());
        System.out.println("Price for movie with Adam Sandler: $" + priceWithSandler);

    }






}