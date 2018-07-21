package org.za.conversions.service.distance;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface DistanceService extends ConverterService{

    ConverterDto getFromUnit(ConverterDto converter);
}
