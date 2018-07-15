package org.za.conversions.service.volume;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.enums.Mass;
import org.za.conversions.service.enums.Volume;

@Service
public class VolumeConverterImpl implements VolumeService {

    private double factor;

    public VolumeConverterImpl() {
    }

    @Override
    public ConverterDto getFromCubicCentimetre(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "cm3":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromCubicDecimetre(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "dm2":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromCubicMetre(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "m3":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromLitre(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "l":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromCubicInch(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "in3":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromCubicFeet(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "ft3":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    private double convert(double amount, double factor){
        double result = amount * factor;

        return result;
    }

    private double getFactor(String unit){

        switch (unit){
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

    private String extractUnit(String unit){
        int start = unit.indexOf("[");
        int end = unit.indexOf("]");

        String result = unit.substring(start + 1, end);
        return result;
    }
}
