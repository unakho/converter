package org.za.conversions.service.mass;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface MassService extends ConverterService{

    ConverterDto getFromUnit(ConverterDto converter);
}
