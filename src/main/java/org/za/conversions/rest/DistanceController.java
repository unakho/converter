package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.distance.DistanceService;

@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class DistanceController {

    @Autowired
    DistanceService distanceConverter;

    @CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
    @RequestMapping(value = "/distance", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {

        int start = converter.getFromUnit().indexOf("[");
        int end = converter.getFromUnit().indexOf("]");

        String unit = converter.getFromUnit().substring(start + 1, end);
        switch (unit) {
            case "m":
                converter = distanceConverter.getFromMeter(converter);
                break;

            case "cm":
                converter = distanceConverter.getFromCm(converter);
                break;

            case "in":
                converter = distanceConverter.getFromInch(converter);
                break;

            case "km":
                converter = distanceConverter.getFromKm(converter);
                break;

            case "ft":
                converter = distanceConverter.getFromFeet(converter);
                break;

            case "ml":
                converter = distanceConverter.getFromMile(converter);
                break;

            case "mm":
                converter = distanceConverter.getFromMilliMetre(converter);
                break;

            case "yd":
                converter = distanceConverter.getFromYard(converter);
                break;
        }
        return converter;
    }
}
