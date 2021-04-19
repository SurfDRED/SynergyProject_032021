package ru.synergyitacademy.lesson6.pet;

public class Cow extends PetAnimal {
    private String voice = "Мычать";

    public Cow(String animal) {
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