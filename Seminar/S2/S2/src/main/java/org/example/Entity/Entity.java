package org.example.Entity;
import io.vavr.collection.List;

public class Entity {

    private String name;
    private double weight;
    private boolean canCut;

    public Entity(String name, double weight, boolean canCut) {

        if(weight < 0) throw new IllegalArgumentException("Weight cannot be negative");

        this.name = name;
        this.weight = weight;
        this.canCut = canCut;
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean canCut() {
        return canCut;
    }

    @Override
    public String toString() {
        return "Ex1{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", canCut=" + canCut +
                '}';
    }
}

class Filter {
    public static List<Entity> filter(List<Entity> entities) {
        return entities.filter(entity -> entity.getWeight() > 1.0);
    }

    public static List<Entity> canCut(List<Entity> entities) {
        return entities.filter((Entity::canCut));
    }
}

