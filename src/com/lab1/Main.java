package com.lab1;

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

        Animal cat = new Animal("Kicia", 4, "cat");
        Animal dog = new Animal("Azor", 0, "snake");

        Phone samsung = new Phone("samsung", "s30", 6.4);
        Phone xiaomi = new Phone("xiaomi", "note", 5.2);


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


//        StringBuilder compareAnimalsText = new StringBuilder("Waga ");
//        if (cat.weight > dog.weight) {
//            compareAnimalsText.append(cat.getName());
//            compareAnimalsText.append(" jest wieksza niz ");
//            compareAnimalsText.append(dog.getName());
//            compareAnimalsText.append("!");
//            System.out.println(compareAnimalsText);
//        } else {
//            System.out.println("Waga " + dog.getName() + " jest wieksza niz " + cat.getName() + "!");
//        }
        if (samsung.screenSize > xiaomi.screenSize) {
            System.out.println("Telefon " + samsung.brand + " " + samsung.model + " jest wiekszy niz " + xiaomi.brand + " " + xiaomi.model + "!");
        } else {
            System.out.println("Telefon " + xiaomi.brand + " " + xiaomi.model + " jest wiekszy niz " + samsung.brand + " " + samsung.model + "!");
        }

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

        Car ferrari = new Car("l450", "ferrari");
        human1.addCar(ferrari);

        human1.getListOfCars().forEach((car) -> {
            System.out.println("Model: " + car.model);
            System.out.println("Producent: " + car.producer);
            if (car.vMax != 0) {
                System.out.println("V-max: " + car.vMax);
            }
            System.out.println();
        });

        ferrari.brand = CarBrands.Ferrari;
        Car audiRs3 = new Car("a3", "audi");
        audiRs3.brand = CarBrands.Audi;
        Car audiA3 = new Car("a3", "audi");
        audiA3.brand = CarBrands.Audi;

        System.out.println("Czy audi sa takie same? ");
        System.out.println(audiRs3.equals(audiA3));

        System.out.println(human1);
        System.out.println(human2);
    }
}
