package ru.synergyitacademy.lesson6.wild;

import ru.synergyitacademy.lesson6.Animal;

public class WildAnimal extends Animal {
    private String type = "Дикое животное";

    public WildAnimal(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + type;
    }
}