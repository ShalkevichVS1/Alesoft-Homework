package com.shalkevich;

public class MainLesson2 {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Андрей", 500, 2),
                new Cat("Барсик", 300, 3),
                new Robot("R2D2", 1000, 1)
        };

        Object[] obstacles = {
                new Treadmill(400),
                new Wall(2)
        };

        for (Participant participant : participants) {
            for (Object obstacle : obstacles) {
                boolean success;
                if (obstacle instanceof Treadmill) {
                    success = ((Treadmill) obstacle).attempt(participant);
                } else {
                    success = ((Wall) obstacle).attempt(participant);
                }
                if (!success) break;
            }
        }
    }
}

