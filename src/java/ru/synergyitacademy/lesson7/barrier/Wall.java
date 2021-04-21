package ru.synergyitacademy.lesson7.barrier;

import ru.synergyitacademy.lesson7.sportsman.Sportsman;

public class Wall extends Barrier{
    private int wallHeight;

    public Wall(String name, int wallHeight) {
        super(name);
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean action(Sportsman sportsman) {
        System.out.println("Высота барьера \"" + super.getName() + "\" составляет: " + this.wallHeight + " м.");
        //Спортсмен прыгает и мы проверяем, преодолел ли он барьер
        sportsman.jump();
        if (this.wallHeight <= sportsman.wallHeight()) {
            System.out.println(sportsman.nameSportsman() + " успешно преодолел барьер!");
            return true;
        } else {
            System.out.println(sportsman.nameSportsman() + " не смог преодолеть барьер...");
            return false;
        }
    }
}