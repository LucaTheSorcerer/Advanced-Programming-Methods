package org.example;

public class Animal {
    private String name;
    private String species;
    private int age;
    private String enclosureType;
    private String healthStatus;

    public Animal(String name, String species, int age, String enclosureType, String healthStatus) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.enclosureType = enclosureType;
        this.healthStatus = healthStatus;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", enclosureType='" + enclosureType + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                '}';
    }


}
