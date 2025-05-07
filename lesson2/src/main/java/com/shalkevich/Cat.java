package com.shalkevich;

public class Cat implements Participant {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Cat (String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        boolean success = distance <= maxRunDistance;
        System.out.println(name + (success ? " успешно пробежал " : " не смог пробежать ") + distance + " метров.");
        return success;
    }

    @Override
    public boolean jump(int height) {
        boolean success = height <= maxJumpHeight;
        System.out.println(name + (success ? " перепрыгнул " : " не смог перепрыгнуть ") + height + " метров.");
        return success;
    }

    @Override
    public String getName() {
        return name;
    }
}


