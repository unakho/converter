package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;
import org.za.conversions.service.area.AreaService;

/**
 * @author unakho.kama
 */
@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class AreaController {

    AreaService areaConverter;

    @Autowired
    public AreaController(AreaService converterService) {
        this.areaConverter = (AreaService) Service.getInstance(converterService);
    }

    @CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
    @RequestMapping(value = "/area", method = RequestMethod.PUT)
    public ConverterDto convert(@RequestBody ConverterDto converter) {
        return (ConverterDto) areaConverter.getFromUnit(converter);
    }
}
