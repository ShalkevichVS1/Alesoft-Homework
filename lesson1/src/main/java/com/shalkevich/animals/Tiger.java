package com.shalkevich.animals;

public class Tiger extends Animal {
    private static int countTigers = 0;

    public Tiger(String name) {
        super(name, 1000, 50);
        countTigers++;
    }

    public static int getCountTigers() {
        return countTigers;
    }
}
