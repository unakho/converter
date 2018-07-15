package org.za.conversions.service.length;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface LengthService extends ConverterService {

    ConverterDto getFromCm(ConverterDto converter);

    ConverterDto getFromMeter(ConverterDto converter);

    ConverterDto getFromKm(ConverterDto converter);

    ConverterDto getFromInch(ConverterDto converter);

    ConverterDto getFromFeet(ConverterDto converter);

    ConverterDto getFromYard(ConverterDto converter);

    ConverterDto getFromMile(ConverterDto converter);

    ConverterDto getFromMilliMetre(ConverterDto converter);
}
