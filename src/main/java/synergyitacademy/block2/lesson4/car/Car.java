package synergyitacademy.block2.lesson4.car;

import synergyitacademy.block2.lesson4.exception.LimitSpeedException;

public interface Car {
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

    //Контролировать скорость
    default void controlSpeed() {
        if (getSpeed() <= 80) {
            System.out.println(getCar() + " автомобиль " + getNumber() + " движется с допустимой скоростью " + String.format("%.2f", getSpeed()));
        } else if (getSpeed() > 80 & getSpeed() <= 100) {
            throw new LimitSpeedException(getCar() + " автомобиль " + getNumber() + " превысил скорость 80 км/ч.");
        } else {
            throw new LimitSpeedException("Полиция задержала " + getCar() + " автомобиль " + getNumber() + " за превышение скорости свыше 100 км/ч.");
        }
    }
}