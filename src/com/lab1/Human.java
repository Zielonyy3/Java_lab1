package com.lab1;

import devices.Car;
import devices.Phone;

import java.util.ArrayList;
import java.util.Date;

public class Human {
    public String name;
    public int age;
    public int height;
    public Animal pet;
    private ArrayList<Car> listOfCars;
    private double salary;
    private Car car;
    private Double cash = 20000.0;
    private Animal animal;


    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }


    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean hasCar(Car newCar) {
        if (this.car == newCar) {
            return true;
        }
        return false;
    }

    public void removeCar() {
        this.car = null;
    }

    public double getSalary() {
        Date date = new Date();
        System.out.println("Dane o wyplacie pobierane: " + date);
        return salary;
    }

    public void sellCar() {
        this.car = null;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Nie mozna przypisac wartosci mniejszesz niz 0");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Prosze odebrac aneks do umowy od Pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty, nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }
    }

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
