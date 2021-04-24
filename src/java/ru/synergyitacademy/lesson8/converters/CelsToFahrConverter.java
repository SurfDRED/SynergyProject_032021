package ru.synergyitacademy.lesson8.converters;

import ru.synergyitacademy.lesson8.Converter;

public class CelsToFahrConverter implements Converter {
    @Override
    public double convert(double request) {
        return request * 1.8 + 32;
    }
}