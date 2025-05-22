package com.shalkevich;

public class Wall {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean attempt(Participant participant) {
        return participant.jump(height);
    }
}
