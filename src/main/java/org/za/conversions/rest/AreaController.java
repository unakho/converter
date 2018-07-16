package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.area.AreaService;

@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class AreaController {

    @Autowired
    AreaService areaConverter;

    @CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
    @RequestMapping(value = "/area", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {

        int start = converter.getFromUnit().indexOf("[");
        int end = converter.getFromUnit().indexOf("]");




        String unit = converter.getFromUnit().substring(start + 1, end);
        switch (unit){
            case "mm2":
                converter = areaConverter.getFromSquareMillimeter(converter);
                break;

            case "cm2":
                converter = areaConverter.getFromSquareCentimeter(converter);
                break;

            case "m2":
                converter = areaConverter.getFromSquareMeter(converter);
                break;

            case "ha":
                converter = areaConverter.getFromHectare(converter);
                break;
        }
        return converter;
    }
}
