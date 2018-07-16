package org.za.conversions.service;

import org.junit.Test;
import org.mockito.Mock;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.model.Converter;
import org.za.conversions.service.area.AreaService;

public class AreaConverterMockTest {

    @Mock
    private ConverterDto dto;
    @Mock
    private Converter currentRole;
    @Mock
    AreaService roleRepositoryMock;

    @Test
    public void canConvertFromSquareMillimeter() {
    }

    @Test
    public void canConvertFromSquareCentimeter() {
    }

    @Test
    public void canConvertFromSquareMeter() {
    }

    @Test
    public void canConvertFromHectare() {
    }
}
