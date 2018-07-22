package org.za.conversions.service.distance;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.base.Converter;
import org.za.conversions.service.enums.Area;
import org.za.conversions.service.enums.Distance;

/**
 * @author unakho.kama
 */
@Service
public class DistanceConverterImpl  extends Converter implements DistanceService<ConverterDto> {

    public DistanceConverterImpl() {
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
                factor = Distance.getUnitConst(unit);
                break;
        }
        return factor;
    }
}
