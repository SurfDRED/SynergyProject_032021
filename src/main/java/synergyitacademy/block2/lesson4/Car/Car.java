package synergyitacademy.block2.lesson4.Car;

import synergyitacademy.block2.lesson4.Limit.Kpp;

public interface Car {
    //Контролировать скорость
    void controlSpeed ();
    //Контролировать параметры
    void controlParameter(Kpp kpp);
    //Тип автомобиля
    String getCar();
    //Номер автомобиля
    String getNumber();
    //Скорость автомобиля
    double getSpeed();
    //Вес автомобиля
    double getWeight();
    //Ширина автомобиля
    double getWidth();
    //высота автомобиля
    double getHeight();
    //длина автомобиля
    double getLength();
}
