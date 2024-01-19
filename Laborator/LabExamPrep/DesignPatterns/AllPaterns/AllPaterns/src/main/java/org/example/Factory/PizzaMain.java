package org.example.Factory;

public class PizzaMain {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizza = pizzaFactory.createPizza("Salami");
        System.out.println(pizza);
    }
}
