package com.lab1;

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

}
