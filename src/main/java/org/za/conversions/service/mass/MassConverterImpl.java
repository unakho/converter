package org.za.conversions.service.mass;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.enums.Length;
import org.za.conversions.service.enums.Mass;

@Service
public class MassConverterImpl implements MassService {

    private double factor;

    public MassConverterImpl() {
    }
    /**
     * Constructs a unit converter to convert between unit and meter
     */
    @Override
    public ConverterDto getFromMilligram(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "mg":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromGram(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "g":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromKilogram(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "kg":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromTone(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "t":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromPound(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "lb":
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

    private String extractUnit(String unit){
        int start = unit.indexOf("[");
        int end = unit.indexOf("]");

        String result = unit.substring(start + 1, end);
        return result;
    }
}
