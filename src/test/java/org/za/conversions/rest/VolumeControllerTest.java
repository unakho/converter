package org.za.conversions.rest;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.za.conversions.BaseTestCase;
import org.za.conversions.dto.ConverterDto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class VolumeControllerTest extends BaseTestCase {

    @Test
    public void successfulConvertIfFromDM2ToFT3() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CUBIC_DECENTIMETRE);
        converter.setToUnit(CUBIC_FEET);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/volume")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromCM3ToFT3() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CUBIC_CENTIMETRE);
        converter.setToUnit(CUBIC_FEET);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/volume")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromM3ToIN3() throws Exception {
        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CUBIC_METER);
        converter.setToUnit(CUBIC_INCH);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/volume")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromCM3ToL() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CUBIC_CENTIMETRE);
        converter.setToUnit(LITRE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/volume")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromLToM3() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(LITRE);
        converter.setToUnit(CUBIC_METER);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/volume")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromIN3ToFT3() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CUBIC_INCH);
        converter.setToUnit(CUBIC_FEET);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromFT3ToIN3() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CUBIC_FEET);
        converter.setToUnit(CUBIC_INCH);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }
}
