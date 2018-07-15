package org.za.conversions.service.area;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.enums.Area;
import org.za.conversions.service.enums.Length;

@Service
public class AreaConverterImpl implements AreaService {

    private double factor;

    public AreaConverterImpl() {
    }

    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromSquareMillimeter(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "mm2":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromSquareCentimeter(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "cm2":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromSquareMeter(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "m2":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromHectare(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "ha":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    private double convert(double amount, double factor) {
        double result = amount * factor;

        return result;
    }

    private double getFactor(String unit) {

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

    private String extractUnit(String unit) {
        int start = unit.indexOf("[");
        int end = unit.indexOf("]");

        String result = unit.substring(start + 1, end);
        return result;
    }
}
