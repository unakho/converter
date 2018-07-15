package org.za.conversions.service.enums;

import org.za.conversions.service.enums.base.UnitValue;

public enum Length implements UnitValue {

    CM("cm", 12D),
    METER("m", 1.23D),
    KM("km", 21.3D),
    INCH("in", 121D),
    FEET("ft", 1.12D),
    YARD("yd", 121D),
    MILEMETRE("mm", 12D),
    MILE("ml", 12D);

    private String unit;
    private Double value;

    Length(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    public static Double getUnitConst(String unit){
        for ( Length length: values()){
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
