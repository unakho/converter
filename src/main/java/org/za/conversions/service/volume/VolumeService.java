package org.za.conversions.service.volume;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface VolumeService extends ConverterService {

    ConverterDto getFromUnit(ConverterDto converter);
}
