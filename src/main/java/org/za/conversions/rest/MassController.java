package org.za.conversions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.za.conversions.Service;
import org.za.conversions.dto.ConverterDto;
import org.za.conversions.service.ConverterService;
import org.za.conversions.service.mass.MassService;

/**
 * @author unakho.kama
 */
@CrossOrigin
@RestController
@RequestMapping("/api/convert")
public class MassController {

    ConverterService<ConverterDto> massConverter;

    @Autowired
    public MassController(MassService converterService) {
        this.massConverter = Service.getInstance(converterService);
    }

    @CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
    @RequestMapping(value = "/mass", method = RequestMethod.PUT)
    public ConverterDto convertToMeter(@RequestBody ConverterDto converter) {
        return massConverter.getFromUnit(converter);
    }
}
