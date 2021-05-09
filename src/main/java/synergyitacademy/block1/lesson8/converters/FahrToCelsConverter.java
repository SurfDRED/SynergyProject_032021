package synergyitacademy.block1.lesson8.converters;

import synergyitacademy.block1.lesson8.Converter;

public class FahrToCelsConverter implements Converter {
    @Override
    public double convert(double request) {
        return (request - 32) / 1.8;
    }
}