package ru.synergyitacademy.lesson6.pet;

public class Cat extends PetAnimal {
    private String voice ="Мяукать";

    public Cat(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + " она умеет " + voice;
    }
}