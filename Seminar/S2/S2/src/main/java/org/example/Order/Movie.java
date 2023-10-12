package org.example.Order;

import io.vavr.control.Option;

public class Movie {


     private  String title;
     private int releaseYear;
     private double evaluation;
     private Option<String> actor;
     private double basePrice;

     public Movie(String title, int releaseYear, double evaluation, Option<String> actor, double basePrice) {
         this.title = title;
         this.releaseYear = releaseYear;
         this.evaluation = evaluation;
         this.actor = actor;
         this.basePrice = basePrice;
     }

     public double getBasePrice() {
         return basePrice;
     }

}
