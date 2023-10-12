package org.example.Order;
import io.vavr.control.Option;


public class ComedyMovieDiscounter implements Discounter {

    private Option<String> actor;

    @Override
    public double calculatePrice(double price) {
        if (actor.isDefined() && actor.get().equalsIgnoreCase("Adam Sandler")) {
            return price * 0.5; // 50% discount for movies starring Adam Sandler
        } else {
            throw new UnsupportedOperationException("Discount not supported for this comedy movie.");
        }
    }

    public ComedyMovieDiscounter(Option<String> actor) {
        this.actor = actor;
    }
}
