package ru.synergyitacademy.lesson6;

public class Animals {
    private String animal;

    public Animals(String animal) {
        this.animal = animal;
    }

    public void voice() {
        System.out.println(toString());
    }

    public String toString() {
        return animal  + " это ";
    }
}