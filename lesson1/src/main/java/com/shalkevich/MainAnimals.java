package com.shalkevich;

import com.shalkevich.animals.Animal;
import com.shalkevich.animals.Dog;
import com.shalkevich.animals.HouseCat;
import com.shalkevich.animals.Tiger;

public class MainAnimals {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Бобик"),
                new HouseCat("Мурзик"),
                new Tiger("Шерхан"),
                new Dog("Рекс"),
                new HouseCat("Барсик")
        };

        for (Animal animal : animals) {
            animal.run(300);
            animal.swim(10);
        }

        System.out.println("Создано животных: " + Animal.getCountAnimals());
        System.out.println("Собак: " + Dog.getCountDogs());
        System.out.println("Котов: " + HouseCat.getCountCats());
        System.out.println("Тигров: " + Tiger.getCountTigers());
    }
}
