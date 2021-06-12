package com.lab1;

public class Animal {
    private String name;
    public String type;
    public int numberOfLegs;

    public Animal(String name, String type, int numberOfLegs) {
        setName(name);
        this.type = type;
        this.numberOfLegs = numberOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
