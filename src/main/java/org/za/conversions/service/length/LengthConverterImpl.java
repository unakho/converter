package org.za.conversions.service.length;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.base.Converter;
import org.za.conversions.service.enums.Length;

/**
 * @author unakho.kama
 */
@Service
public class LengthConverterImpl extends Converter implements LengthService<ConverterDto> {

    public LengthConverterImpl() {
    }

    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromUnit(ConverterDto input) {

        double factor = 0.00;
        ConverterDto converter = super.extractUnits(input);

        switch (converter.getFromUnit()) {
            case "mm":
            case "ml":
            case "cm":
            case "m":
            case "in":
            case "ft":
            case "yd":
            case "km":
                factor = getToUnit(converter.getToUnit());
                break;
        }

        double amount = converter.getAmount() * factor;
        converter.setAmount(amount);
        return converter;
    }

    private double getToUnit(String unit) {

        double factor = 0.00;
        switch (unit) {
            case "mm":
            case "ml":
            case "cm":
            case "m":
            case "in":
            case "ft":
            case "yd":
            case "km":
                factor = Length.getUnitConst(unit);
                break;
        }
        return factor;
    }

}
