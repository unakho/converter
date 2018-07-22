package org.za.conversions.service.base;

import org.za.conversions.dto.ConverterDto;

/**
 * @author unakho.kama
 */
public abstract class Converter<ConverterDto> {

    protected org.za.conversions.dto.ConverterDto extractUnits(ConverterDto input) {

        //extract units from an item to be converted
        org.za.conversions.dto.ConverterDto converter = (org.za.conversions.dto.ConverterDto)input;
        String fromUnit = converter.getFromUnit().substring(converter.getFromUnit()
                .indexOf("[") + 1, converter.getFromUnit().indexOf("]"));

        String toUnit = converter.getToUnit().substring(converter.getToUnit()
                .indexOf("[") + 1, converter.getToUnit().indexOf("]"));

        //we make sure converter is updated with extracted units from the names
        converter.setFromUnit(fromUnit);
        converter.setToUnit(toUnit);

        return converter;
    }
}
