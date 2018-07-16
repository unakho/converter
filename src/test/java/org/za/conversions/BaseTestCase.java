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
import org.za.conversions.service.enums.Area;
import org.za.conversions.service.enums.Temperature;

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

    //area
    public static final String SQUARE_MILLIMETRE = "Square Millimetre/s [mm2]";
    public static final String SQUARE_CENTIMETRE = "Square Centimetre/s [cm2]";
    public static final String SQUARE_METRE = "Square Metre/s [m2]";
    public static final String HECTARE = "Hectare/s [ha]";
    public static final String SQUARE_KILOMETRE = "Square Kilometre/s [km2]";
    public static final String SQUARE_INCH = "Square Inch/s [in2]";
    public static final String SQUARE_FEET = "Square Feet [sq ft]";
    public static final String SQUARE_YARD = "Square Yard/s [yd2]";
    public static final String ARCH = "Acre/s [a]";
    public static final String SQUARE_MILE = "Square Mile/s [ml2]";

    //distance
    public static final String MILLIMETRE = "Millimetre/s [mm]";
    public static final String CENTIMETRE = "Centimetre/s [cm]";
    public static final String METRE = "Metre/s [m]";
    public static final String KILOMETRE = "Kilometre/s [km]";
    public static final String INCH = "Inch/s [ft]";
    public static final String FEET = "Feet [m]";
    public static final String YARD = "Yard/s [yd]";
    public static final String MILE = "Mile/s [ml]";

    //mass
    public static final String GRAM = "Gram/s [g]";
    public static final String KILOGRAM = "Kilogram/s [kg]";
    public static final String TONE = "Tone/s [t]";
    public static final String POUND = "Pound/s [lb]";
    public static final String MILLIGRAM = "Millgram/s [mg]";

    //volume
    public static final String CUBIC_CENTIMETRE = "Cubic Centimetre/s [cm3]";
    public static final String CUBIC_DECENTIMETRE = "Cubic Decimetre/s [dm2]";
    public static final String CUBIC_METER = "Cubic Metre/s [m3]";
    public static final String LITRE = "Litre/s [l]";
    public static final String CUBIC_INCH = "Cubic Inch/s [in3]";
    public static final String CUBIC_FEET = "Cubic Feet [ft3]";
    //temperature
    public static final String CELCIUS = "Celcius [c]";
    public static final String FARENHEIT = "Fahrenheit [f]";

    //area
    public static final double SQUARE_MILLIMETRE_MOUNT = 123D;
    public static final double SQUARE_CENTIMETRE_MOUNT = 123D;
    public static final double SQUARE_METRE_MOUNT = 123D;
    public static final double HECTARE_MOUNT = 123D;
    public static final double SQUARE_KILOMETRE_MOUNT = 123D;
    public static final double SQUARE_INCH_MOUNT = 123D;
    public static final double SQUARE_FEET_MOUNT = 123D;
    public static final double SQUARE_YARD_MOUNT = 123D;
    public static final double ARCH_MOUNT = 123D;
    public static final double SQUARE_MILE_MOUNT = 123D;

    //distance
    public static final double MILLIMETRE_MOUNT = 123D;
    public static final double CENTIMETRE_MOUNT = 123D;
    public static final double METRE_MOUNT = 123D;
    public static final double FEET_MOUNT = 123D;
    public static final double YARD_MOUNT = 123D;
    public static final double MILE_MOUNT = 123D;

    //mass/
    public static final double GRAM_AMOUNT = 123D;
    public static final double KILOGRAM_AMOUNT = 123D;
    public static final double TONE_AMOUNT = 123D;
    public static final double POUND_AMOUNT = 123D;

    //temperature
    public static final double CELCIUS_AMOUNT = 123D;
    public static final double FARENHEIT_AMOUNT = 123D;

    //volume
    public static final double CUBIC_CENTIMETRE_AMOUNT = 1231D;
    public static final double CUBIC_DECENTIMETRE_AMOUNT = 12D;
    public static final double CUBIC_METER_AMOUNT = 30D;
    public static final double LITRE_AMOUNT = 4D;
    public static final double CUBIC_INNCH_AMOUNT = 11D;
    public static final double CUBIC_FEET_AMOUNT = 22D;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    /*
     * converts a Java object into JSON representation
     */
    protected String asJsonString(final Object obj) throws Exception {
        return new ObjectMapper().writeValueAsString(obj);
    }

    protected double getFactor(String unit){

        double factor = 0.00;
        switch (unit){
            case "c":
            case "f":
                factor = Area.getUnitConst(unit);
                break;
        }
        return factor;
    }

    protected String extractUnit(String unit) {
        int start = unit.indexOf("[");
        int end = unit.indexOf("]");

        String result = unit.substring(start + 1, end);
        return result;
    }
}
