package org.za.conversions.rest;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.za.conversions.BaseTestCase;
import org.za.conversions.dto.ConverterDto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AreaControllerTest extends BaseTestCase {

    @Test
    public void successfulConvertIfFromSquareMM2ToFT2() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(SQUARE_MILLIMETRE);
        converter.setToUnit(SQUARE_FEET);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareCM2ToMM2() throws Exception {
        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(SQUARE_CENTIMETRE);
        converter.setToUnit(SQUARE_MILLIMETRE);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareIN2ToARCH() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(SQUARE_INCH);
        converter.setToUnit(ARCH);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareFT2ToMM2() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(SQUARE_FEET);
        converter.setToUnit(SQUARE_MILLIMETRE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareYD2ToARCH() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(SQUARE_YARD);
        converter.setToUnit(ARCH);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareArchToFT2() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(ARCH);
        converter.setToUnit(SQUARE_FEET);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareML2ToMM2() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(SQUARE_MILE);
        converter.setToUnit(SQUARE_MILLIMETRE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }
}
