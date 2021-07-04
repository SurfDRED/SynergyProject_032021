package synergyitacademy.block2.lesson4.Car;

import synergyitacademy.block2.lesson4.Exception.LimitOneSpeedException;
import synergyitacademy.block2.lesson4.Exception.LimitParamException;
import synergyitacademy.block2.lesson4.Exception.LimitTwoSpeedException;
import synergyitacademy.block2.lesson4.Limit.Kpp;

public class CargoCar implements Car{
    //Тип автомобиля
    private String car;
    //номер автомобиля
    private String number;
    //скорость передвижения
    private double speed;
    //собственный вес
    private double weight;
    //ширина автомобиля
    private double width;
    //высота автомобиля
    private double height;
    //длина автомобиля
    private double length;

    public CargoCar(String number, double speed, double weight, double width, double height, double length) {
        this.car = "Грузовой";
        this.number = number;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public String getCar() {
        return car;
    }

    public String getNumber() {
        return number;
    }

    public double getSpeed() {
        return speed;
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

    public double getLength() {
        return length;
    }

    @Override
    public void controlSpeed() {
        if (getSpeed() <= 80) {
            System.out.println(getCar() + " автомобиль " + getNumber() + " движется с допустимой скоростью " + String.format("%.2f", getSpeed()));
        } else if (getSpeed() > 80 & getSpeed() <= 100) {
            throw new LimitOneSpeedException(getCar() + " автомобиль " + getNumber() + " превысил скорость 80 км/ч.");
        } else {
            throw new LimitTwoSpeedException("Полиция задержала " + getCar() + " автомобиль " + getNumber() + " за превышение скорости свыше 100 км/ч.");
        }
    }

    @Override
    public void controlParameter(Kpp kpp) {
        if (getWeight() > kpp.getWeight() || getHeight() > kpp.getHeight() || getWidth() > kpp.getWidth()) {
            throw new LimitParamException(getCar() + " автомобиль " + getNumber() + " не может проехать через КПП.");
        }
    }
}