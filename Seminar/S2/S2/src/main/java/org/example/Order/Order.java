package org.example.Order;

public class Order {

    private int quantity;
    private Movie movie;
    private Discounter discounter;

    public Order(int quantity, Movie movie, Discounter discounter) {
        this.quantity = quantity;
        this.movie = movie;
        this.discounter = discounter;
    }

    public double calculatePrice() {
        double price = movie.getBasePrice();
        double discount = discounter.calculatePrice(price);
        return quantity * discount;
    }


}
