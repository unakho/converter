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
    public ConverterDto convert(@RequestBody ConverterDto converter) {
        return areaConverter.getFromUnit(converter);
    }
}
