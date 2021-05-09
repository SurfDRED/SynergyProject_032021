package synergyitacademy.block1.lesson8.converters;

import synergyitacademy.block1.lesson8.Converter;

public class KelvToFahrConverter implements Converter {
    @Override
    public double convert(double request) {
        return request * 1.8 - 459.67;
    }
}