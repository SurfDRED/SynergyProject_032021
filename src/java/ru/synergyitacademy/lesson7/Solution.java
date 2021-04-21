package ru.synergyitacademy.lesson7;

import ru.synergyitacademy.lesson7.barrier.Barrier;
import ru.synergyitacademy.lesson7.barrier.Track;
import ru.synergyitacademy.lesson7.barrier.Wall;
import ru.synergyitacademy.lesson7.sportsman.Cat;
import ru.synergyitacademy.lesson7.sportsman.Human;
import ru.synergyitacademy.lesson7.sportsman.Robot;
import ru.synergyitacademy.lesson7.sportsman.Sportsman;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        //Создадим массив объектов спортсменов, так как нельзя наследоваться, создадим интерфейс
        Sportsman[] sportsman = new Sportsman[9];
        //Создадим несколько разных объектов спортсменов с рандомными параметрами
        Random random = new Random();
        sportsman[0] = new Human("Иван", random.nextInt(100),random.nextInt(20));
        sportsman[1] = new Human("Дмитрий", random.nextInt(100),random.nextInt(20));
        sportsman[2] = new Human("Татьяна", random.nextInt(100),random.nextInt(20));
        sportsman[3] = new Cat("Васька", random.nextInt(100),random.nextInt(20));
        sportsman[4] = new Cat("Баксик", random.nextInt(100),random.nextInt(20));
        sportsman[5] = new Cat("Черныш", random.nextInt(100),random.nextInt(20));
        sportsman[6] = new Robot("R.Bot 100", random.nextInt(100),random.nextInt(20));
        sportsman[7] = new Robot("SAR-400", random.nextInt(100),random.nextInt(20));
        sportsman[8] = new Robot("ILife A6", random.nextInt(100),random.nextInt(20));
        //Создадим массив объектов барьеров, через массив базового класса
        Barrier[] barrier = new Barrier[9];
        barrier[0] = new Track("Стартовая дорожка", 50);
        barrier[1] = new Wall("Малая стартовая высота", 5);
        barrier[2] = new Track("Малая дорожка", 10);
        barrier[3] = new Wall("Забор", 6);
        barrier[4] = new Track("Лесная тропинка", 40);
        barrier[5] = new Wall("Стена", 8);
        barrier[6] = new Track("Горячий Асфальт", 30);
        barrier[7] = new Wall("Кирпичный забор", 10);
        barrier[8] = new Track("Финишная дорожка", 50);
        //Запускаем каждого спортсмена через препятствия
        for (int x = 0; x < sportsman.length; x++) {
            boolean winner = true;
            for (int y = 0; y < barrier.length; y++) {
                winner = barrier[y].action(sportsman[x]);
                if (!winner) {
                    break;
                }
            }
            if (winner) {
                System.out.println("Спортсмен " + sportsman[x].nameSportsman() + " преодолел все препятствия!!!");
            } else {
                System.out.println("Спортсмен " + sportsman[x].nameSportsman() + " сошел с дистанции...");
            }
            System.out.println();
        }
    }
}