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

        Animal cat = new Animal("Kicia", "Cat", 4);
        Animal dog = new Animal("Azor", "Dog", 3);

        Phone samsung = new Phone("samsung", "s30", 6.4);
        Phone xiaomi = new Phone("xiaomi", "note", 5.2);
        
    }
}
