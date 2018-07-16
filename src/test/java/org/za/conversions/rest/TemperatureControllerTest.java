package org.za.conversions.rest;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.za.conversions.BaseTestCase;
import org.za.conversions.dto.ConverterDto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TemperatureControllerTest extends BaseTestCase {

    @Test
    public void successfulConvertIfFromCELCIUSToFARENHEIT() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CELCIUS);
        converter.setToUnit(FARENHEIT);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/temperature")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromFARENHEITToCELCIUS() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(FARENHEIT);
        converter.setToUnit(CELCIUS);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/temperature")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }
}
