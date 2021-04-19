package ru.synergyitacademy.lesson6.wild;

public class Tiger extends WildAnimal {
    private String voice = "Урчать";

    public Tiger(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + " он умеет " + voice;
    }
}