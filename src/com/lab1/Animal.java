package com.lab1;

public class Animal {
    public String name;
    public int numberOfLegs;
    private double weight;
    final String species;
    public boolean isAlive = true;

    public Animal(String name, int numberOfLegs, String species) {
        this.name = name;
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        setInitialWeight();
    }

    private void setInitialWeight() {
        switch (this.species) {
            case "dog" -> this.weight = 33.5;
            case "cat" -> this.weight = 15;
            case "horse" -> this.weight = 552.4;
            case "snake" -> this.weight = 3;
        }
    }

    public void feed() {
        if(isAlive){
            this.weight += 2;
            System.out.println(this.name + " waży teraz " + this.weight);

        }else{
            System.out.println("Twoje zwierze nie żyje.");
        }
    }

    public void takeForAWalk() {
        if(isAlive){
            this.weight -= 3;
            System.out.println(this.name + " waży teraz " + this.weight);

            if(this.weight <= 0){
                this.isAlive = false;
                System.out.println(this.name + " umarł.");

            }
        }else{
            System.out.println("Twoje zwierze nie żyje.");
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        String tmpString = "Imie " + this.name + "\n";
        tmpString += "Gatunek: " + this.species + "\n";
        tmpString += "Waga: " + this.weight + "\n";

        return tmpString;
    }
}
