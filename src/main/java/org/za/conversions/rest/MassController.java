package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.mass.MassService;

@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class MassController {

    @Autowired
    MassService massConverter;

    @CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
    @RequestMapping(value = "/mass", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {

        int start = converter.getFromUnit().indexOf("[");
        int end = converter.getFromUnit().indexOf("]");

        String unit = converter.getFromUnit().substring(start + 1, end);
        switch (unit) {

            case "mg":
                converter = massConverter.getFromMilligram(converter);
                break;

            case "g":
                converter = massConverter.getFromGram(converter);
                break;

            case "kg":
                converter = massConverter.getFromKilogram(converter);
                break;

            case "t":
                converter = massConverter.getFromTone(converter);
                break;

            case "lb":
                converter = massConverter.getFromPound(converter);
                break;
        }
        return converter;
    }
}
