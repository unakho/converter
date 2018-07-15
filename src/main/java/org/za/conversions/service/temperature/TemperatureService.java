package org.za.conversions.service.temperature;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface TemperatureService extends ConverterService{

    ConverterDto getFromFarenheit(ConverterDto converter);
    ConverterDto getFromCelcius(ConverterDto converter);
}
