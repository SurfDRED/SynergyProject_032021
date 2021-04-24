package ru.synergyitacademy.lesson8;

import ru.synergyitacademy.lesson8.converters.*;

public enum Temperature {
    CELS_FAXR(new CelsToFahrConverter()),
    CELS_KELV(new CelsToKelvConverter()),
    FAXR_CELS(new FahrToCelsConverter()),
    FAXR_KELV(new FahrToKelvConverter()),
    KELV_CELS(new KelvToCelsConverter()),
    KELV_FAXR(new KelvToFahrConverter());

    private Converter converter;

    Temperature(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return this.converter;
    }

}