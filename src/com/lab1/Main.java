package com.lab1;

import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Producer;
import devices.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(args));
        System.out.println(new Date());

        Human human1 = new Human("Szymon", 21, 180);
        Human human2 = new Human("Jan", 45, 160);
        Human human3 = new Human("Tomek", 45, 160);

        Animal cat = new Animal("Kicia", 4, "cat");
        Animal dog = new Animal("Azor", 0, "snake");

        Phone samsung = new Phone(Producer.Samsung, "s30", 2019, 6.4);
        Phone xiaomi = new Phone(Producer.Xiaomi, "note", 2020, 5.2);


        cat.feed();
        cat.feed();
        cat.feed();
        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(human1);
        humanList.add(human2);

        Human tomek = new Human("Tomasz", 13, 165);
        humanList.add(tomek);


        for (int i = 0; i < humanList.size(); i++) {
            System.out.println("------------------------------");
            System.out.println("Imie: " + humanList.get(i).name);
            System.out.println("Wiek: " + humanList.get(i).age);
            System.out.println("Wzrost: " + humanList.get(i).height);
            System.out.println("------------------------------");
        }

        Car ferrari = new Car(Producer.Ferrari,  "l450", 2010);
        human1.addCar(ferrari);

        human1.getListOfCars().forEach((car) -> {
            System.out.println("Model: " + car.model);
            System.out.println("Producent: " + car.producer);
            if (car.vMax != 0) {
                System.out.println("V-max: " + car.vMax);
            }
            System.out.println();
        });

        Car audiRs3 = new Car(Producer.Audi,  "rs3", 2003);
        Car audiA3 = new Car(Producer.Audi,  "a3", 2004);



        human1.setSalary(399);
        human1.getSalary();
        human1.setCar(audiA3);
        human1.setAnimal(cat);


        try {
            audiA3.sell(human1,human2,9800.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cat.sell(human1,human2,1420.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            human1.sell(human3,human2,100.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
