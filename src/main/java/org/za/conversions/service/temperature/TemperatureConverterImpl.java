package org.za.conversions.service.temperature;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.base.Converter;
import org.za.conversions.service.enums.Temperature;

@Service
public class TemperatureConverterImpl extends Converter implements TemperatureService {

    public TemperatureConverterImpl() {
    }

    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromUnit(ConverterDto input) {

        double factor = 0.00;
        ConverterDto converter = super.extractUnits(input);

        switch (converter.getFromUnit()) {
            case "c":
            case "f":
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
            case "c":
            case "f":
                factor = Temperature.getUnitConst(unit);
                break;
        }
        return factor;
    }
}
