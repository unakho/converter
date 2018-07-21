package org.za.conversions.service.base;

import org.za.conversions.dto.ConverterDto;

public abstract class Converter {

    private ConverterDto converter;

    public Converter() {
    }

    public Converter(ConverterDto converter) {
        this.converter = converter;
    }

    protected ConverterDto extractUnits(ConverterDto converter) {

        //extract units from an item to be converted
        String fromUnit = converter.getFromUnit().substring(converter.getFromUnit()
                .indexOf("[") + 1, converter.getFromUnit().indexOf("]"));

        String toUnit = converter.getFromUnit().substring(converter.getFromUnit()
                .indexOf("[") + 1, converter.getFromUnit().indexOf("]"));

        //we make sure converter is updated with newly created values
        converter.setFromUnit(fromUnit);
        converter.setToUnit(toUnit);

        return converter;
    }

    public ConverterDto getConverter() {
        return converter;
    }

    public void setConverter(ConverterDto converter) {
        this.converter = converter;
    }
}
