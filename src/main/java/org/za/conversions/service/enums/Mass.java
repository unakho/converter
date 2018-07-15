package org.za.conversions.service.enums;

import org.za.conversions.service.enums.base.UnitValue;

public enum Mass  implements UnitValue {
    MILLIGRAM("mg", 12D),
    GRAM("g", 12D),
    KILOGRAM("kg", 12D),
    TONE("t", 33D),
    POUND("lb", 11D);

    private String unit;
    private Double value;

    Mass(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    public static Double getUnitConst(String unit){
        for ( Mass mass: values()){
            if (unit.equals(mass.getUnit())){
                return mass.getValue();
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
