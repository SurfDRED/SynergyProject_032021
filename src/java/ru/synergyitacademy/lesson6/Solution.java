package ru.synergyitacademy.lesson6;

import ru.synergyitacademy.lesson6.pet.*;
import ru.synergyitacademy.lesson6.wild.*;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Cat("Кошка"));
        animalsList.add(new Dog("Сабака"));
        animalsList.add(new Cow("Корова"));
        animalsList.add(new Pig("Свинья"));
        animalsList.add(new Bear("Медведь"));
        animalsList.add(new Tiger("Тигр"));
        animalsList.add(new Fox("Лиса"));
        animalsList.add(new Squirrel("Белка"));
        for (Animals animals : animalsList) {
            animals.voice();
        }
    }
}