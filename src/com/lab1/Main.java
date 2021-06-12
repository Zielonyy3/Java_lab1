package com.lab1;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(args));
        System.out.println(new Date());

        Human human1 = new Human("Szymon", 21, 180);
        Human human2 = new Human("Jan", 45, 160);

        Animal cat = new Animal("Kicia", "Cat", 4, 12.3);
        Animal dog = new Animal("Azor", "Dog", 3, 32.1);

        Phone samsung = new Phone("samsung", "s30", 6.4);
        Phone xiaomi = new Phone("xiaomi", "note", 5.2);


        if (cat.weight > dog.weight) {
            System.out.println("Waga " + cat.getName() + " jest wieksza niz " + dog.getName() + "!");
        } else {
            System.out.println("Waga " + dog.getName() + " jest wieksza niz " + cat.getName() + "!");
        }

        if (samsung.screenSize > xiaomi.screenSize) {
            System.out.println("Telefon " + samsung.brand + " " + samsung.model + " jest wiekszy niz " + xiaomi.brand + " " + xiaomi.model + "!");
        } else {
            System.out.println("Telefon " + xiaomi.brand + " " + xiaomi.model + " jest wiekszy niz " + samsung.brand + " " + samsung.model + "!");
        }
    }
}
