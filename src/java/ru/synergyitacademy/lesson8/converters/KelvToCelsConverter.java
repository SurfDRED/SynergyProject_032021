package ru.synergyitacademy.lesson8.converters;

import ru.synergyitacademy.lesson8.Converter;

public class KelvToCelsConverter implements Converter {
    @Override
    public double convert(double request) {
        return request - 273.15;
    }
}