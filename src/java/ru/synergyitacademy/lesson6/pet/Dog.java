package ru.synergyitacademy.lesson6.pet;

public class Dog extends PetAnimal {
    private String voice = "Гавкать";

    public Dog(String animal) {
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