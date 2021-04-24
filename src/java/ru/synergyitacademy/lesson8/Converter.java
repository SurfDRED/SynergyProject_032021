package ru.synergyitacademy.lesson8;

public interface Converter {

    double convert(double request);

    static Converter getConverter(Temperature temperature) {
        return temperature.getConverter();
    }
}
