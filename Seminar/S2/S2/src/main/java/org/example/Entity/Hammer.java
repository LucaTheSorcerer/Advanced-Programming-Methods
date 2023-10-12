package org.example.Entity;

public class Hammer extends Entity {

    private String name;
    private double weight;
    private final boolean canCut = false;

    public Hammer(String name, double weight, boolean canCut) {
        super(name, weight, canCut);
    }


}
