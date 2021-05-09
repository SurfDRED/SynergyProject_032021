package synergyitacademy.block1.lesson7.barrier;

import synergyitacademy.block1.lesson7.sportsman.Sportsman;

public class Track extends Barrier{
    private int trackLength;

    public Track(String name, int trackLength) {
        super(name);
        this.trackLength = trackLength;
    }

    @Override
    public boolean action(Sportsman sportsman) {
        System.out.println("Длинна дорожки \"" + super.getName() + "\" составляет: " + this.trackLength + " м.");
        //Спортсмен бежит и мы проверяем, преодолел ли он дистанцию
        sportsman.run();
        if (this.trackLength <= sportsman.trackLength()) {
            System.out.println(sportsman.nameSportsman() + " успешно пробежал дистанцию!");
            return true;
        } else {
            System.out.println(sportsman.nameSportsman() + " не смог пробежать дистанцию...");
            return false;
        }
    }
}