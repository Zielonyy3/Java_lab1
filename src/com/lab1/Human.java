package com.lab1;

import devices.Car;

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


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.price) {
            System.out.println("Udalo sie kupic samochod za gotowke");
            this.car = car;
        } else if (this.salary > car.price / 12) {
            System.out.println("Udalo sie kupic samochod na kredyt");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }


    public double getSalary() {
        Date date = new Date();
        System.out.println("Dane o wyplacie pobierane: " + date);
        return salary;
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
