package org.za.conversions.service.distance;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.enums.Distance;
import org.za.conversions.service.enums.Length;

@Service
public class DistanceConverterImpl implements DistanceService {

    private double factor;

    public DistanceConverterImpl() {
    }

    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromCm(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "cm":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromMeter(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "m":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromKm(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "km":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromInch(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "in":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromFeet(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "ft":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromYard(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "yd":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromMile(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "ml":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromMilliMetre(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit) {
            case "mm":
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
            case "m":
            case "km":
            case "in":
            case "ft":
            case "yd":
            case "ml":
            case "mm":
                factor = Distance.getUnitConst(unit);
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
