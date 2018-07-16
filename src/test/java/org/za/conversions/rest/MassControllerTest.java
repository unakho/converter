package org.za.conversions.rest;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.za.conversions.BaseTestCase;
import org.za.conversions.dto.ConverterDto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MassControllerTest extends BaseTestCase {

    @Test
    public void successfulConvertIfFromGToKG() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(GRAM);
        converter.setToUnit(KILOGRAM);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/mass")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromKGToTONE() throws Exception {
        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(KILOGRAM);
        converter.setToUnit(TONE);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/mass")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareMGToPOUND() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(MILLIGRAM);
        converter.setToUnit(POUND);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/mass")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromPOUNDToTONE() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(POUND);
        converter.setToUnit(TONE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/mass")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromTONEToG() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(TONE);
        converter.setToUnit(GRAM);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/mass")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }
}
