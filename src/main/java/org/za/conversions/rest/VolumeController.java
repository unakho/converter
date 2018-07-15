package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.volume.VolumeService;

@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class VolumeController {

    @Autowired
    VolumeService volumeConverter;

    @CrossOrigin(origins = {"http://localhost:4200"})
    @RequestMapping(value = "/volume", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {

        int start = converter.getFromUnit().indexOf("[");
        int end = converter.getFromUnit().indexOf("]");

        String unit = converter.getFromUnit().substring(start + 1, end);
        switch (unit){
            case "cm3":
                converter = volumeConverter.getFromCubicCentimetre(converter);
                break;

            case "dm2":
                converter = volumeConverter.getFromCubicDecimetre(converter);
                break;

            case "m3":
                converter = volumeConverter.getFromCubicMetre(converter);
                break;

            case "l":
                converter = volumeConverter.getFromLitre(converter);

            case "in3":
                converter = volumeConverter.getFromCubicInch(converter);

            case "ft3":
                converter = volumeConverter.getFromCubicFeet(converter);
        }
        return converter;
    }
}
