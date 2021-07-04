package synergyitacademy.block2.lesson4;

import synergyitacademy.block2.lesson4.Car.Car;
import synergyitacademy.block2.lesson4.Car.CargoCar;
import synergyitacademy.block2.lesson4.Car.PassengerCar;

import java.util.Random;

public class ListCars {

    public Car[] getListCars(Car...car){
        Random random = new Random();
        String[] arrayLetters = {"А", "Б", "В", "Г", "Д", "Е", "И", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т"};
        for (int i = 0; i < car.length; i++) {
            int x =(int) (Math.random() * 2);;
            // Х111ХХ
            String name = arrayLetters[random.nextInt(15)] + random.nextInt(999)
                    + arrayLetters[random.nextInt(15)]
                    + arrayLetters[random.nextInt(15)];
            double speed = 20 + random.nextDouble() * 90;
            double weight = 3 + random.nextDouble() * 6;
            double width = 1 + random.nextDouble() * 2;
            double height = 2 + random.nextDouble() * 3;
            double length = 2 + random.nextDouble() * 20;
            if (x == 1) {
                car[i] = new CargoCar(name, speed,weight, width, height, length);
            } else {
                car[i] = new PassengerCar(name, speed,weight, width, height, length);
            }
        }
        return car;
    }
}