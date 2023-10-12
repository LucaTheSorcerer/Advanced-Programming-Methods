package org.example.Entity;

public class Saw extends Entity implements Cut {

    private String name;
    private double weight;

    public Saw(String name, double weight, boolean canCut) {
        super(name, weight, canCut);
    }

    @Override
    public String toString() {
        boolean canCut = false;
        return "Saw{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", canCut=" + canCut +
                '}';
    }

    @Override
    public void cut() {
        System.out.println("Cutting");
    }
}
