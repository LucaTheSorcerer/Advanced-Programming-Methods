package org.example.Factory;

public class PizzaFactory {

    public PizzaFactory() {}

    public Pizza createPizza(String type) {
        Pizza pizzaBasic;

        if(type.equals("Salami")) {
            System.out.println("Creating pizza with Salami");
            pizzaBasic = new Pizza();
            pizzaBasic.getToppings().add("Salami");
            return pizzaBasic;
        } else if(type.equals("Salami and Oregano")) {
            System.out.println("Creating pizza with salami and oregano");
            pizzaBasic = new Pizza();
            pizzaBasic.getToppings().add("Salami");
            pizzaBasic.getToppings().add("Oregano");
            return pizzaBasic;
        } else {
            return new Pizza();
        }
    }
}
