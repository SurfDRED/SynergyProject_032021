package ru.synergyitacademy.lesson6.pet;

import ru.synergyitacademy.lesson6.Animals;

public class PetAnimal extends Animals {
    private String type = "Домашнее животное";

    public PetAnimal(String animal) {
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