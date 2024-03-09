package com.example.Aggregation;

public class AggregationExample {

    public static void main(String[] args) {
        Address address = new Address("123 Main St.", "Cityville");
        Person person = new Person(address);
        System.out.println("Person's Address: " + person.getAddress().getStreet() + ", " + person.getAddress().getCity());
    }
}
