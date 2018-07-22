package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;
import org.za.conversions.service.area.AreaService;
import org.za.conversions.service.volume.VolumeService;

/**
 * @author unakho.kama
 */
@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class VolumeController {

    ConverterService<ConverterDto> volumeConverter;

    @Autowired
    public VolumeController(VolumeService converterService) {
        this.volumeConverter = Service.getInstance(converterService);
    }

    @CrossOrigin(origins = {"http://localhost:4200"})
    @RequestMapping(value = "/volume", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {
        return volumeConverter.getFromUnit(converter);
    }
}
