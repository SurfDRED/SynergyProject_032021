package synergyitacademy.block2.lesson4;

import synergyitacademy.block2.lesson4.car.Car;
import synergyitacademy.block2.lesson4.exception.LimitSpeedException;
import synergyitacademy.block2.lesson4.exception.LimitParamException;
import synergyitacademy.block2.lesson4.limit.Kpp;

public class Solution {
    public static void main(String[] args) {
        Kpp kpp = new Kpp();
        Car[] car = ListCars.getListCars();
        for (int i = 0; i < car.length; i++) {
            try {
                System.out.println();
                System.out.println("-------ПРОЕЗД ЧЕРЕЗ КПП-------------------");
                System.out.println(car[i].getCar() + " автомобиль " + car[i].getNumber());
                System.out.println("Скорость движения: " + String.format("%.2f", car[i].getSpeed()) + " км/ч");
                car[i].controlSpeed();
                System.out.println("Вес автомобиля: " + String.format("%.2f", car[i].getWeight()) + " т");
                System.out.println("Габариты: ");
                System.out.println(" Высота: " + String.format("%.2f", car[i].getHeight()) + " м");
                System.out.println(" Ширина: " + String.format("%.2f", car[i].getWidth()) + " м");
                System.out.println(" Длина: " + String.format("%.2f", car[i].getLength()) + " м");
                kpp.controlParameter(car[i]);
                System.out.println(car[i].getCar() + " автомобиль " + car[i].getNumber() + " проверку прошел.");
                System.out.println("-------ПРОЕЗД ЧЕРЕЗ КПП РАЗРЕШЕН-----------");
            } catch (LimitSpeedException | LimitParamException e) {
                System.out.println("-------ПРОЕЗД ЧЕРЕЗ КПП ЗАПРЕЩЕН-----------");
            }
        }
    }
}