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
        return volumeConverter.getFromUnit(converter);
    }
}
