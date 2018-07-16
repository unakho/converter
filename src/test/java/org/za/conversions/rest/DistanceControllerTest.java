package org.za.conversions.rest;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.za.conversions.BaseTestCase;
import org.za.conversions.dto.ConverterDto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class DistanceControllerTest extends BaseTestCase {

    @Test
    public void successfulConvertIfFromSquareMMToM() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(MILLIMETRE);
        converter.setToUnit(METRE);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareCMToMM() throws Exception {
        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(CENTIMETRE);
        converter.setToUnit(MILLIMETRE);
        converter.setAmount(12);

        mockMvc.perform(put("/api/convert/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareINToFEET() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(INCH);
        converter.setToUnit(FEET);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareFTToMILE() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(FEET);
        converter.setToUnit(MILE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareMILEToCM() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(MILE);
        converter.setToUnit(CENTIMETRE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareYToMILE() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(YARD);
        converter.setToUnit(MILE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulConvertIfFromSquareMLToMM() throws Exception {

        ConverterDto converter = new ConverterDto();

        converter.setFromUnit(MILE);
        converter.setToUnit(MILLIMETRE);
        converter.setAmount(11);

        mockMvc.perform(put("/api/convert/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(converter)))
                .andExpect(status().isOk());
    }
}
