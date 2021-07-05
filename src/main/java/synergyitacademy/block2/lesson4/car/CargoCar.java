package synergyitacademy.block2.lesson4.car;

public class CargoCar implements Car {
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
}