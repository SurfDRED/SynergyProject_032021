package ru.synergyitacademy.lesson8.converters;

import ru.synergyitacademy.lesson8.Converter;

public class FahrToKelvConverter implements Converter {
    @Override
    public double convert(double request) {
        return (request + 459.67)/ 1.8;
    }
}