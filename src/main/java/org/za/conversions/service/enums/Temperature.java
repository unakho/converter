package org.za.conversions.service.enums;

import org.za.conversions.service.enums.base.UnitValue;

public enum Temperature  implements UnitValue {
    CELCIUS("c", 12D),
    FANREIT("f", 12D);

    private String unit;
    private Double value;

    Temperature(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    public static Double getUnitConst(String unit){
        for ( Temperature temperature: values()){
            if (unit.equals(temperature.getUnit())){
                return temperature.getValue();
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
