package synergyitacademy.block1.lesson6.wild;

public class Fox extends WildAnimal {
    private String voice = "Лаять";

    public Fox(String animal) {
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