package com.shalkevich.animals;

public class Dog extends Animal {
    private static int countDogs = 0;

    public Dog(String name) {
        super(name, 500, 10);
        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }
}

