package org.za.conversions.service.volume;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.base.Converter;
import org.za.conversions.service.enums.Volume;

@Service
public class VolumeConverterImpl extends Converter implements VolumeService {

    private double factor;

    public VolumeConverterImpl() {
    }

    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromUnit(ConverterDto input) {

        double factor = 0.00;
        ConverterDto converter = super.extractUnits(input);

        switch (converter.getFromUnit()) {
            case "cm3":
            case "dm2":
            case "m3":
            case "l":
            case "in3":
            case "ft3":
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
            case "cm3":
            case "dm2":
            case "m3":
            case "l":
            case "in3":
            case "ft3":
                factor = Volume.getUnitConst(unit);
                break;
        }
        return factor;
    }
}
