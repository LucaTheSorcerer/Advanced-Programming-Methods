package org.example.Movie;
import io.vavr.Function2;
import io.vavr.control.Option;

public abstract class Movie {
    protected final String title;
    protected final int releaseYear;
    protected final double evaluation;
    protected final Option<String> actor;
    protected final double basePrice;

    public Movie(String title, int releaseYear, double evaluation, Option<String> director, double basePrice) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.evaluation = evaluation;
        this.actor = director;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();
}

class SciFiMovie extends Movie {
    public SciFiMovie(String title, int releaseYear,double evaluation) {
        super(title, releaseYear, evaluation, Option.none(), 1.0);
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}

class HorrorMovie extends Movie {
    public HorrorMovie(String title, int releaseYear, double evaluation) {
        super(title, releaseYear, evaluation, Option.none(), 0.9);
    }

    @Override
    public double calculatePrice() {
        return basePrice * (1.0 - 0.1);
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie(String title, int releaseYear, double evaluation, String actor) {
        super(title, releaseYear, evaluation, Option.of(actor), 1.2);
    }

    @Override
    public double calculatePrice() {
//        return actor.getOrElse("").equalsIgnoreCase("Adam Sandler") ? basePrice * 0.5 : basePrice;
        if (actor.isDefined() && actor.get().equalsIgnoreCase("Adam Sandler")) {
            return basePrice * 0.5;
        } else {
            throw new UnsupportedOperationException("Discount not supported for this comedy movie.");
        }
    }


}



