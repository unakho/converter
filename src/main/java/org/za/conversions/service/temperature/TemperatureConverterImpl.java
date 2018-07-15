package org.za.conversions.service.temperature;

import org.springframework.stereotype.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.enums.Length;
import org.za.conversions.service.enums.Temperature;

@Service
public class TemperatureConverterImpl implements TemperatureService {

    private double factor;

    public TemperatureConverterImpl() {
    }

    @Override
    public ConverterDto getFromFarenheit(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "c":
                factor = getFactor(toUnit);
                break;
        }
        converter.setAmount(convert(converter.getAmount(), factor));
        return converter;
    }

    @Override
    public ConverterDto getFromCelcius(ConverterDto converter) {

        double factor = 0.00;
        String fromUnit = extractUnit(converter.getFromUnit());
        String toUnit = extractUnit(converter.getToUnit());

        switch (fromUnit){
            case "c":
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
            case "c":
            case "f":
                factor = Temperature.getUnitConst(unit);
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
