package org.za.conversions.service.mass;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface MassService extends ConverterService{

    ConverterDto getFromMilligram(ConverterDto converter);
    ConverterDto getFromGram(ConverterDto converter);
    ConverterDto getFromKilogram(ConverterDto converter);
    ConverterDto getFromTone(ConverterDto converter);
    ConverterDto getFromPound(ConverterDto converter);
}
