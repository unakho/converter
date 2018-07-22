package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;
import org.za.conversions.service.temperature.TemperatureService;

/**
 * @author unakho.kama
 */
@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class TemperatureController {

    ConverterService<ConverterDto> temperatureConverter;

    @Autowired
    public TemperatureController(TemperatureService converterService) {
        this.temperatureConverter = Service.getInstance(converterService);
    }

    @CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
    @RequestMapping(value = "/temperature", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {
        return temperatureConverter.getFromUnit(converter);
    }
}
