package ru.synergyitacademy.lesson6.wild;

public class Squirrel extends WildAnimal {
    private String voice = "Цокать";

    public Squirrel(String animal) {
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