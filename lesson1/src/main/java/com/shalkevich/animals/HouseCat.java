package com.shalkevich.animals;

public class HouseCat extends Animal {
    private static int countCats = 0;

    public HouseCat(String name) {
        super(name, 200, 0);
        countCats++;
    }

    public static int getCountCats() {
        return countCats;
    }
}

