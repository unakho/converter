package org.za.conversions.service.mass;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.base.Converter;
import org.za.conversions.service.enums.Mass;

@Service
public class MassConverterImpl extends Converter implements MassService {

    public MassConverterImpl() {
    }

    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromUnit(ConverterDto input) {

        double factor = 0.00;
        ConverterDto converter = super.extractUnits(input);

        switch (converter.getFromUnit()) {
            case "mg":
            case "g":
            case "kg":
            case "t":
            case "lb":
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
            case "mg":
            case "g":
            case "kg":
            case "t":
            case "lb":
                factor = Mass.getUnitConst(unit);
                break;
        }
        return factor;
    }

}
