package synergyitacademy.block4.lesson3.bad;

public class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public void read() {
        System.out.println(name + " Я могу читать.");
    }
    public void teach() {
        System.out.println(name + " Я могу учить.");
    }
}