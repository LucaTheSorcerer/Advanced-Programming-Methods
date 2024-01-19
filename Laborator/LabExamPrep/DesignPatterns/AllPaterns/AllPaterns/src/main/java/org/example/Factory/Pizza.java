package org.example.Factory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<String> toppings = new ArrayList<>();
    boolean hasMozzarella;

    public Pizza(){}

    public void setHasMozzarella(boolean hasMozzarella) {
        this.hasMozzarella = hasMozzarella;
    }

    public List<String> getToppings() {
        return this.toppings;
    }

    public Pizza addSalami() {
        this.toppings.add("Salami");
        return this;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                ", hasMozzarella=" + hasMozzarella +
                '}';
    }

    public Pizza addTomato() {
        this.toppings.add("Tomato");
        return this;
    }

    public Pizza addOregano() {
        this.toppings.add("Oregano");
        return this;
    }
}
