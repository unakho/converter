package org.za.conversions.service.area;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.base.Converter;
import org.za.conversions.service.enums.Area;

@Service
public class AreaConverterImpl extends Converter implements AreaService {

    public AreaConverterImpl() {
    }
    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromUnit(ConverterDto input) {

        double factor = 0.00;
        ConverterDto converter = super.extractUnits(input);

        switch (converter.getFromUnit()) {
            case "mm2":
            case "cm2":
            case "m2":
            case "ha":
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
            case "mm2":
            case "cm2":
            case "m2":
            case "ha":
                factor = Area.getUnitConst(unit);
                break;
        }
        return factor;
    }
}
