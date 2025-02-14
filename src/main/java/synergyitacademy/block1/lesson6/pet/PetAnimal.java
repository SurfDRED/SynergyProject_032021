package synergyitacademy.block1.lesson6.pet;

import synergyitacademy.block1.lesson6.Animal;

public class PetAnimal extends Animal {
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