package com.lab1;

public class Animal {
    private String name;
    public String type;
    public int numberOfLegs;
    public double weight;

    public Animal(String name, String type, int numberOfLegs, double weight) {
        setName(name);
        this.type = type;
        this.numberOfLegs = numberOfLegs;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
