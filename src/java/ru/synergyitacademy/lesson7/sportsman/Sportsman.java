package ru.synergyitacademy.lesson7.sportsman;

public interface Sportsman {
    //Спортсмен умеет бегать
    void run();
    //Спортсмен умеет прыгать
    void jump();
    // Метод вернет расстояние
    int trackLength();
    // Метод вернет высоту
    int wallHeight();
    // Метод вернет имя спортсмена
    String nameSportsman();
}