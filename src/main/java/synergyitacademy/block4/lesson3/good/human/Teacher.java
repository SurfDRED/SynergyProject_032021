package synergyitacademy.block4.lesson3.good.human;

import synergyitacademy.block4.lesson3.good.Human;


public class Teacher extends Human {
    @Override
    public void read() {
        System.out.println("Я учитель - Я могу читать.");
    }

    public void teach() {
        System.out.println("Я учитель - Я могу учить!");
    }
}
