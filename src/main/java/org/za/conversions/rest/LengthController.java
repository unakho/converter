package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.length.LengthService;

@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class LengthController {

    @Autowired
    LengthService lengthConverter;

    @CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
    @RequestMapping(value = "/length", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {

        int start = converter.getFromUnit().indexOf("[");
        int end = converter.getFromUnit().indexOf("]");

        String unit = converter.getFromUnit().substring(start + 1, end);
        switch (unit) {
            case "m":
                converter = lengthConverter.getFromMeter(converter);
                break;

            case "cm":
                converter = lengthConverter.getFromCm(converter);
                break;

            case "in":
                converter = lengthConverter.getFromInch(converter);
                break;

            case "km":
                converter = lengthConverter.getFromKm(converter);
                break;

            case "ft":
                converter = lengthConverter.getFromFeet(converter);
                break;

            case "ml":
                converter = lengthConverter.getFromMile(converter);
                break;

            case "mm":
                converter = lengthConverter.getFromMilliMetre(converter);
                break;

            case "yd":
                converter = lengthConverter.getFromYard(converter);
                break;
        }
        return converter;
    }
}
