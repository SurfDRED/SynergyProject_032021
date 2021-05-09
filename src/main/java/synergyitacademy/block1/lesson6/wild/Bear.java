package synergyitacademy.block1.lesson6.wild;

public class Bear extends WildAnimal {
    private String voice = "Реветь";

    public Bear(String animal) {
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
