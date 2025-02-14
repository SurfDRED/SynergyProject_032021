package synergyitacademy.block2.lesson1;

public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car.Driver driver = new Car.Driver("Петров А. В.");
        Car car = new Car("ВАЗ", "21011", driver);
        Car.Driver newDriver = driver;
        Car newCar = car;
        Car.Driver anotherDriver = driver.clone();
        Car anotherCar = car.clone();
        //Объект, копия и клон
        System.out.println("Объект:");
        System.out.println("Водитель: " + driver);
        System.out.println("Автомобиль: " + car);
        System.out.println(driver.print());
        System.out.println(car.print());
        System.out.println("Копия:");
        System.out.println("Водитель: " + newDriver);
        System.out.println("Автомобиль: " + newCar);
        System.out.println(newDriver.print());
        System.out.println(newCar.print());
        System.out.println("Клон:");
        System.out.println("Водитель: " + anotherDriver);
        System.out.println("Автомобиль: " + anotherCar);
        System.out.println(anotherDriver.print());
        System.out.println(anotherCar.print());
        //Изменение объекта, копия и клон
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Объект A меняем данные");
        car.setBrandCar("Toyota");
        car.setModelCar("Camry Solara");
        driver.setNameDriver("Васечкин А. Е.");
        System.out.println("Объект:");
        System.out.println("Водитель: " + driver);
        System.out.println("Автомобиль: " + car);
        System.out.println(car.print());
        System.out.println("Копия:");
        System.out.println("Водитель: " + newDriver);
        System.out.println("Автомобиль: " + newCar);
        System.out.println(newCar.print());
        System.out.println("Клон:");
        System.out.println("Водитель: " + anotherDriver);
        System.out.println("Автомобиль: " + anotherCar);
        System.out.println(anotherCar.print());
    }
}