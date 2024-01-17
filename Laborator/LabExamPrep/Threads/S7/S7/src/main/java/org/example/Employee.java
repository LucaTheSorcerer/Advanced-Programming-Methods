package org.example;

public class Employee {

    private String name;
    private int Gehalt;

    public Employee(String name, int gehalt) {
        this.name = name;
        Gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGehalt() {
        return Gehalt;
    }

    public void setGehalt(int gehalt) {
        Gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Gehalt=" + Gehalt +
                '}';
    }


}
