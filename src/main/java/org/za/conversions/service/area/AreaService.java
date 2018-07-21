package org.za.conversions.service.area;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface AreaService extends ConverterService {

    public ConverterDto getFromUnit(ConverterDto converter);
}
