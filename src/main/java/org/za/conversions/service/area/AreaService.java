package org.za.conversions.service.area;

import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;

public interface AreaService extends ConverterService {

    public ConverterDto getFromSquareMillimeter(ConverterDto converter);

    public ConverterDto getFromSquareCentimeter(ConverterDto converter);

    public ConverterDto getFromSquareMeter(ConverterDto converter);

    public ConverterDto getFromHectare(ConverterDto converter);
}
