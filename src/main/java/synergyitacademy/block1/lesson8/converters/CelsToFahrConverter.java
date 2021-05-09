package synergyitacademy.block1.lesson8.converters;

import synergyitacademy.block1.lesson8.Converter;

public class CelsToFahrConverter implements Converter {
    @Override
    public double convert(double request) {
        return request * 1.8 + 32;
    }
}