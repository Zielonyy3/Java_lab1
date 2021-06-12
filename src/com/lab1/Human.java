package com.lab1;

import devices.Car;

import java.util.ArrayList;

public class Human {
    public String name;
    public int age;
    public int height;
    public Animal pet;
    private ArrayList<Car> listOfCars;

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.listOfCars = new ArrayList<>();
    }

    public ArrayList<Car> getListOfCars() {
        return listOfCars;
    }

    public void addCar(Car car) {
        this.listOfCars.add(car);
    }

    public String toString() {
        String tmpString = "-------------------\n";
        tmpString += "Imie " + this.name + "\n";
        tmpString += "Wiek: " + this.age + "\n";
        tmpString += "Wzrost: " + this.height + "\n";
        if (this.pet != null) {
            tmpString += "Imie zwierzecia: " + this.pet.name + "\n";
        }

        tmpString += "Liczba aut: " + this.listOfCars.size() + "\n";

        if (this.listOfCars.size() > 0) {
            for (Car car : this.getListOfCars()) {
                tmpString += car.toString();
            }
        }
        return tmpString;
    }

}
