package org.za.conversions.service.length;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface LengthService extends ConverterService {

    public ConverterDto getFromUnit(ConverterDto converter);
}
