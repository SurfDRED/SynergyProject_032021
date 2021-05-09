package synergyitacademy.block1.lesson8.converters;

import synergyitacademy.block1.lesson8.Converter;

public class FahrToKelvConverter implements Converter {
    @Override
    public double convert(double request) {
        return (request + 459.67)/ 1.8;
    }
}