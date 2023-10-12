package org.example.Order;

public class HorrorMovieDiscounter implements Discounter {

    @Override
    public double calculatePrice(double price) {
        return price * 0.9;
    }
}
