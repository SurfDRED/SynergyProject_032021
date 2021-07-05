package synergyitacademy.block2.lesson4.limit;

import synergyitacademy.block2.lesson4.car.Car;
import synergyitacademy.block2.lesson4.exception.LimitParamException;

public class Kpp {
    //допустимый вес
    private double weight;
    //допустимая ширина автомобиля
    private double width;
    //допустимая высота автомобиля
    private double height;

    public Kpp() {
        this.weight = 8;
        this.width = 2.5;
        this.height = 4;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void controlParameter(Car car) {
        if (car.getWeight() > getWeight() || car.getHeight() > getHeight() || car.getWidth() > getWidth()) {
            throw new LimitParamException(car.getCar() + " автомобиль " + car.getNumber() + " не может проехать через КПП.");
        }
    }
}