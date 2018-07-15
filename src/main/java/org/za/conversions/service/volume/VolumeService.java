package org.za.conversions.service.volume;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface VolumeService extends ConverterService{

    ConverterDto getFromCubicCentimetre(ConverterDto converter);
    ConverterDto getFromCubicDecimetre(ConverterDto converter);
    ConverterDto getFromCubicMetre(ConverterDto converter);
    ConverterDto getFromLitre(ConverterDto converter);
    ConverterDto getFromCubicInch(ConverterDto converter);
    ConverterDto getFromCubicFeet(ConverterDto converter);
}
