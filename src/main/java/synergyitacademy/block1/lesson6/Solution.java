package synergyitacademy.block1.lesson6;

import synergyitacademy.block1.lesson6.pet.Cow;
import synergyitacademy.block1.lesson6.pet.Dog;
import synergyitacademy.block1.lesson6.pet.Pig;
import synergyitacademy.block1.lesson6.wild.Bear;
import synergyitacademy.block1.lesson6.wild.Tiger;
import synergyitacademy.block1.lesson6.pet.Cat;
import synergyitacademy.block1.lesson6.wild.Fox;
import synergyitacademy.block1.lesson6.wild.Squirrel;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Cat("Кошка"));
        animalsList.add(new Dog("Сабака"));
        animalsList.add(new Cow("Корова"));
        animalsList.add(new Pig("Свинья"));
        animalsList.add(new Bear("Медведь"));
        animalsList.add(new Tiger("Тигр"));
        animalsList.add(new Fox("Лиса"));
        animalsList.add(new Squirrel("Белка"));
        for (Animal animals : animalsList) {
            animals.voice();
        }
    }
}