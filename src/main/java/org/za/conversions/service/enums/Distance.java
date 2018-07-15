package org.za.conversions.service.enums;

import org.za.conversions.service.enums.base.UnitValue;

public enum Distance  implements UnitValue {
    CM("cm", 12D),
    METER("m", 0.23D),
    KM("km", 21.3D),
    INCH("in", 121D),
    FEET("ft", 0.12D),
    YARD("yd", 121D),
    MILE("ml", 12D),
    MILlLIMETRE("mm", 12D);

    private String unit;
    private Double value;

    Distance(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    public static Double getUnitConst(String unit){
        for ( Distance distance: values()){
            if (unit.equals(distance.getUnit())){
                return distance.getValue();
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
