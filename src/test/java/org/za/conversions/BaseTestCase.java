package org.za.conversions;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author unakho.kama
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = Application.class)
public abstract class BaseTestCase {

    @Autowired
    protected WebApplicationContext wac;

    protected MockMvc mockMvc;

    //distance
    public static final double SQUARE_MILLIMETRE = 123D;
    public static final double SQUARE_CENTIMETRE = 123D;
    public static final double SQUARE_METRE = 123D;
    public static final double HECTARE = 123D;
    public static final double SQUARE_KILOMETRE = 123D;
    public static final double SQUARE_INCH = 123D;
    public static final double SQUARE_FEET = 123D;
    public static final double SQUARE_YARD = 123D;
    public static final double ARCH = 123D;
    public static final double SQUARE_MILE = 123D;

    //distance
    public static final double MILLE_METRE = 123D;
    public static final double CENTIMETRE = 123D;
    public static final double METRE = 123D;
    public static final double FEET = 123D;
    public static final double YARD = 123D;
    public static final double MILE = 123D;

    //volume
    public static final double CUBIC_CENTIMETRE = 1231D;
    public static final double CUBIC_DECENTIMETRE = 12D;
    public static final double CUBIC_METER = 30D;
    public static final double LITRE = 4D;
    public static final double CUBIC_INNCH = 11D;
    public static final double CUBIC_FEET = 22D;

    //mass/
    public static final double GRAM = 123D;
    public static final double KILOGRAM = 123D;
    public static final double TONE = 123D;
    public static final double POUND = 123D;

    //temperature
    public static final double CELCIUS = 123D;
    public static final double FARENHEIT = 123D;


    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    /*
     * converts a Java object into JSON representation
     */
    public String asJsonString(final Object obj) throws Exception {
        return new ObjectMapper().writeValueAsString(obj);
    }
}
