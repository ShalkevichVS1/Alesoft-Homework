package com.shalkevich;

public class Treadmill {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean attempt(Participant participant) {
        return participant.run(length);
    }
}

