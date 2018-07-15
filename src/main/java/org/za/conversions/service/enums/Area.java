package org.za.conversions.service.enums;

import org.za.conversions.service.enums.base.UnitValue;

public enum Area implements UnitValue {

    SQUARE_MILLIMETRE("mm2", 12D),
    SQUARE_CENTIMETRE("cm2", 12.23D),
    SQUARE_METRE("m2", 21.3D),
    HECTARE("ha", 121D),
    SQUARE_KILOMETRE("km2", 0.12D),
    SQUARE_INCH("in2", 121D),
    SQUARE_FEET("sq ft", 12D),
    SQUARE_YARD("yd2", 12D),
    ARCH("a", 12D),
    SQUARE_MILE("ml2", 12D);

    private String unit;
    private Double value;

    Area(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    public static Double getUnitConst(String unit){
        for ( Area length: values()){
            if (unit.equals(length.getUnit())){
                return length.getValue();
            }
        }
        return 0.00;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    }
